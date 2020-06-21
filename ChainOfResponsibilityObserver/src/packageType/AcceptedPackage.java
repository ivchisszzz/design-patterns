package packageType;

import chain.Handler;

public class AcceptedPackage extends PackageStateHandler {


  @Override
  public void setPackageState(Handler handler) {
    System.out.println(" * the package is accepted...");
    handler.setStateHandler(new PreparationState());

  }

}
