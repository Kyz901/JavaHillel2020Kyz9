package HomeWork4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write a consumption per 100 km in ur car ---- ");
        float con = sc.nextFloat();
        System.out.print("Write a volume of fuel ---- ");
        float vol = sc.nextFloat();
        Car car = new Car(con,vol);


        float priceOfFuelOKKODF = (float) 26.99;
        float totalPriceOfFuel = 0;
        float N;

        float NOdessaKrivoeOzero = (float) 178.1;
        float NKrivoeOzeroJashkov = (float) 152;
        float NJashkovKyiv = (float) 151;
        System.out.println("");
        System.out.println("|-------------Traveling [Odessa - Kyiv]-------------|");
        System.out.println("");
        System.out.println("|-------------Consumtion = "+con+" -------------|");
        System.out.println("|-------------Volume of fuel = "+vol+" -------------|");
        System.out.println("");
        System.out.println("No fuel...       Refuel...");
        car.fullFuel();
        System.out.println("");
        System.out.println("Starting travel...        Current location: Odessa        Fuel: "+car.balanceOfFuel+" L         Next stop : KrivoeOzero("+NOdessaKrivoeOzero+"km)");
        System.out.println("");
        N = NOdessaKrivoeOzero;
        car.balanceOfFuel = car.valueBalanceOfFuelAfterN(N);


        totalPriceOfFuel = totalPriceOfFuel + (car.valueNeededFuelAfterN(N) * priceOfFuelOKKODF);

        System.out.println("                          Current location: Krivoe Ozero  Fuel: "+car.balanceOfFuel+" L         Next stop : Jashkov("+NKrivoeOzeroJashkov+"km)");
        System.out.println("Needed fuel = "+car.valueNeededFuelAfterN(N)+"L");
        System.out.println("Refuel....");
        float totalNeededToRefuel = 0;
        totalNeededToRefuel += car.valueNeededFuelAfterN(N);
        System.out.println("");

        car.fullFuel();
        N = NKrivoeOzeroJashkov;
        car.balanceOfFuel = car.valueBalanceOfFuelAfterN(N);
        car.valueNeededFuelAfterN(N);

        totalPriceOfFuel = totalPriceOfFuel + (car.valueNeededFuelAfterN(N) * priceOfFuelOKKODF);

        System.out.println("                          Current location: Jashkov        Fuel: "+car.balanceOfFuel+" L         Next stop : Kyiv("+NJashkovKyiv+"km)");
        System.out.println("Needed fuel = "+car.valueNeededFuelAfterN(N)+"L");
        System.out.println("Refuel....");
        totalNeededToRefuel += car.valueNeededFuelAfterN(N);

        car.fullFuel();
        System.out.println(" ");
        N = NJashkovKyiv;
        car.balanceOfFuel = car.valueBalanceOfFuelAfterN(N);
        System.out.println("                          Current location: Kyiv        Fuel: "+car.balanceOfFuel+" L");
        System.out.println("Travel is over!");

        System.out.println(" ");
        System.out.println("Total needed to refuel = "+totalNeededToRefuel+" L");
        System.out.println("Price of full travel = "+totalPriceOfFuel+" grv");



    }
}
