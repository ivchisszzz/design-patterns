package chain;

import java.util.Observable;
import packageType.AcceptedPackage;
import packageType.PackageStateHandler;
import packageType.PackageTypeEnum;

public abstract class Handler extends Observable {

  private Handler successor;
  private PackageStateHandler stateHandler = new AcceptedPackage();

  public Handler() {

  }

  public Handler(Handler successor) {
    this.successor = successor;
  }

  public Handler getSuccessor() {
    return successor;
  }



  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }

  public void parse(PackageTypeEnum packageType) {
    if (getSuccessor() != null) {
      successor.parse(packageType);
    } else {
      System.out.println("  @ Unable to find the correct handler for the package: " + packageType);
    }
  }

  public PackageStateHandler getStateHandler() {
    return stateHandler;
  }

  public void setStateHandler(PackageStateHandler stateHandler) {
    this.stateHandler = stateHandler;
    setChanged();
    notifyObservers();
  }



}
