package chain;

import packageType.PackageTypeEnum;

public class ForeignPackagesHandler extends Handler {

  public ForeignPackagesHandler(Handler successor) {
    this.setSuccessor(successor);
  }

  @Override
  public void parse(PackageTypeEnum packageType) {
    System.out.printf("Trying to process %s with %s ... %n", packageType,
        this.getClass().getName());

    if (canHandlePackage(packageType)) {
      System.out.println("  # An international handler is handling the package: " + packageType);
    } else {
      super.parse(packageType);
    }
  }
}
