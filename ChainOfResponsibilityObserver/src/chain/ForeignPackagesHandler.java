package chain;

import packageType.PackageTypeEnum;

public class ForeignPackagesHandler extends Handler {

  public ForeignPackagesHandler(Handler successor) {
    super(successor);
  }



  public ForeignPackagesHandler() {

  }


  @Override
  public void parse(PackageTypeEnum packageType) {

    if (canHandlePackage(packageType)) {
      System.out.println("  # An international handler is handling the package: " + packageType);
      getStateHandler().setPackageState(this);
      return;
    } else {
      super.parse(packageType);
    }
  }

  protected boolean canHandlePackage(PackageTypeEnum packageType) {
    return packageType != null && packageType == PackageTypeEnum.INTERNATIONAL;

  }



}
