package chain;

import packageType.PackageTypeEnum;

public class CountryPackagesHandler extends Handler {

  public CountryPackagesHandler(Handler successor) {
    this.setSuccessor(successor);
  }



  @Override
  public void parse(PackageTypeEnum packageType) {

    if (canHandlePackage(packageType)) {
      System.out.println("  # A inside country handler is handling the package: " + packageType);
      getStateHandler().setPackageState(this);
      return;
    } else {
      super.parse(packageType);
    }
  }

  protected boolean canHandlePackage(PackageTypeEnum packageType) {
    return packageType != null && packageType == PackageTypeEnum.COUNTRY;

  }

}
