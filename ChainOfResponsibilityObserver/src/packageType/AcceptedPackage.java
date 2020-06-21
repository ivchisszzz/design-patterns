package packageType;

public class AcceptedPackage implements PackageState {

  @Override
  public void alert(PackageStateContext ctx) {
    System.out.println(" * the package is accepted...");

  }

}
