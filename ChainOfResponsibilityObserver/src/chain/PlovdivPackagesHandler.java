package chain;

import packageType.PackageTypeEnum;

public class PlovdivPackagesHandler extends Handler {


  public PlovdivPackagesHandler(Handler successor) {
    super(successor);
  }


  @Override
  public void parse(PackageTypeEnum packageType) {

    if (canHandlePackage(packageType)) {
      System.out.println("  # A plovdiv package handler is handling the package: " + packageType);
      getStateHandler().setPackageState(this);
      return;
    } else {
      super.parse(packageType);
    }
  }

  protected boolean canHandlePackage(PackageTypeEnum packageType) {
    return packageType != null && packageType == PackageTypeEnum.PLOVDIV;

  }
}
