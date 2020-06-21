package packageType;

public class PackageStateContext {

  private PackageState packageState;

  public PackageStateContext() {
    packageState = new PreparationState();
  }

  public PackageState getPackageState() {
    return packageState;
  }

  public void setPackageState(PackageState packageState) {
    this.packageState = packageState;
  }


}
