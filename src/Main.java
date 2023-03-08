
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        double distance = 200;
        double fuelprice = 19.42;


        ArrayList <Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Volvo","S90", 180, 2016, 8.0F,4));
        vehicles.add(new Truck("Scania", "R450",100, 2019,35f,4,12));
        vehicles.add(new Motorcycle("Kawasaki", "Ninja ZT-10R",300,2020,6.0f, true));

        Vehicle cheap = null;
        float price;
        float cheapest = 0;

        // could also used instanceOf, but i think this works as well!
        for (Vehicle v: vehicles) {
            System.out.println(v);
            System.out.println("Travel distance: " + distance + "km");
            System.out.println("Fuel nedded: " + Calculate.calculateConsumption(v.fuelConsumption,distance));
            System.out.println("Price: " + Calculate.price(Calculate.calculateConsumption(v.fuelConsumption,distance),fuelprice));
            System.out.println();

            price = Calculate.price(Calculate.calculateConsumption(v.fuelConsumption,distance),fuelprice);
            if (cheapest == 0){
                cheapest = price;
                cheap = v;
            }
            if (cheapest > price){
                cheapest = price;
                cheap = v;
            }

        }

        System.out.println(cheap.brand + " " + cheap.model + " är den billigaste, den kostar bara " + cheapest + " per sträcka");






        // TODO: 2023-03-07 fixa utskrift
        // Harley-Davidson Sportster (2019) är billigast, den kostar bara 194.20 kronor per sträcka.

    }

}