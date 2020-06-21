package packageType;

public class Package {

  public Package(PackageTypeEnum packageType) {

    this.packageType = packageType;
  }

  PackageTypeEnum packageType;

  public PackageTypeEnum getPackageType() {
    return packageType;
  }

  public void setPackageType(PackageTypeEnum packageType) {
    this.packageType = packageType;
  }


}
