package packageType;

public class PreparationState implements PackageState {

  @Override
  public void alert(PackageStateContext ctx) {
    System.out.println(" * the paackage went in state of preparation...");

  }

}
