package packageType;

import chain.Handler;

public class PreparationState extends PackageStateHandler {

  @Override
  public void setPackageState(Handler handler) {
    System.out.println(" * the package is prepared to be delivered...");
    handler.setStateHandler(new AcceptedPackage());

  }



}
