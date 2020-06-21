package chain;

import packageType.PackageTypeEnum;

public class CountryPackagesHandler extends Handler {

  public CountryPackagesHandler(Handler successor) {
    this.setSuccessor(successor);
  }

  @Override
  public void parse(PackageTypeEnum packageType) {
    System.out.printf("Trying to process %s with %s ... %n", packageType,
        this.getClass().getName());

    if (canHandlePackage(packageType)) {
      System.out.println("  # A inside country handler is handling the package: " + packageType);
    } else {
      super.parse(packageType);
    }
  }



}
