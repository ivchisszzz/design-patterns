package delivery;

import java.util.Observable;
import java.util.Observer;
import chain.Handler;
import packageType.PackageStateHandler;
import packageType.PreparationState;

public class DeliveryBoy implements Observer {

  private String name;


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DeliveryBoy(String name) {
    super();
    this.name = name;
  }


  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof Handler) {
      Handler handler = ((Handler) o);
      PackageStateHandler statehandler = handler.getStateHandler();
      if (statehandler != null && statehandler instanceof PreparationState) {
        System.out
            .println(" * tha package is got by " + name + " and is ready to be moved to stock");
        statehandler.setPackageState(handler);
      }
    }
  }

}
