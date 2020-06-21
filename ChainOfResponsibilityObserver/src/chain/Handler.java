package chain;

import packageType.PackageTypeEnum;

public abstract class Handler {

  private Handler successor;

  public Handler getSuccessor() {
    return successor;
  }

  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }

  public void parse(PackageTypeEnum packageType) {
    if (getSuccessor() != null) {
      System.out.printf("   * Redirecting to %s ...%n", getSuccessor().getClass().getName());
      getSuccessor().parse(packageType);
    } else {
      System.out.println("  @ Unable to find the correct handler for the package: " + packageType);
    }
  }

  protected boolean canHandlePackage(PackageTypeEnum packageType) {
    return (packageType != null);
  }

}
