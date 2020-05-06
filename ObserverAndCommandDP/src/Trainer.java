import java.util.Observable;

public class Trainer extends Observable {
  private Exercise exercise;

  void showExercise(Exercise exercise) {

    if (this.exercise == null || !(exercise.toString().equals(this.exercise.toString()))) {
      this.exercise = exercise;
      this.exercise.execute();
      setChanged();
      notifyObservers();

    }
  }

  public Exercise getExercise() {
    return exercise;
  }



}
