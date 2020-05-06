import java.util.Observable;
import java.util.Observer;

public class Viewer implements Observer {

  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void update(Observable arg0, Object arg1) {
    System.out
        .println(name + " performed the exercise " + (((Trainer) arg0).getExercise().toString()));

  }

  public Viewer(String name) {
    this.name = name;
  }



}
