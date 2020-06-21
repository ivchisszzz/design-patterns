import java.util.ArrayList;
import java.util.List;
import chain.CountryPackagesHandler;
import chain.ForeignPackagesHandler;
import chain.Handler;
import chain.PlovdivPackagesHandler;
import delivery.DeliveryBoy;
import packageType.Package;
import packageType.PackageTypeEnum;

public class Client {

  public static void main(String[] args) {

    DeliveryBoy deliveryBoy = new DeliveryBoy("Delivery boy");
    Handler chainHandler = buildChain(deliveryBoy);

    for (Package p : listAllPackages()) {

      chainHandler.parse(p.getPackageType());
      System.out.println();

    }

  }

  private static Handler buildChain(DeliveryBoy deliveryBoy) {
    ForeignPackagesHandler foreignPackageHandler = new ForeignPackagesHandler();
    foreignPackageHandler.addObserver(deliveryBoy);
    CountryPackagesHandler countryPackageHandler =
        new CountryPackagesHandler(foreignPackageHandler);
    countryPackageHandler.addObserver(deliveryBoy);
    PlovdivPackagesHandler plovdivPackageHandler =
        new PlovdivPackagesHandler(countryPackageHandler);
    plovdivPackageHandler.addObserver(deliveryBoy);


    return plovdivPackageHandler;
  }

  private static List<Package> listAllPackages() {

    List<Package> packages = new ArrayList<>();
    packages.add(new Package(PackageTypeEnum.INTERNATIONAL));
    packages.add(new Package(PackageTypeEnum.COUNTRY));
    packages.add(new Package(PackageTypeEnum.PLOVDIV));
    return packages;

  }

}
