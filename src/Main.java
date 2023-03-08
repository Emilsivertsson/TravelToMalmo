
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        // initiate varibles and a Vehicle list to store the different vehicles in.
        double distance = 200;
        double fuelprice = 19.42;

        ArrayList <Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Volvo","S90", 180, 2016, 8.0F,4));
        vehicles.add(new Truck("Scania", "R450",100, 2019,35f,4,12));
        vehicles.add(new Motorcycle("Kawasaki", "Ninja ZT-10R",300,2020,6.0f, true));

        //varibles to help sort out the cheapest method of travel
        Vehicle cheap = null;
        float price;
        float cheapest = 0;

        // could also used instanceOf, but i think this works as well!
        // prints every vehicle in list and adds the calculations for fuel and price.
        for (Vehicle v: vehicles) {
            System.out.println(v);
            System.out.println("Travel distance: " + distance + "km");
            System.out.println("Fuel nedded: " + Calculate.calculateConsumption(v.getFuelConsumption(),distance));
            System.out.println("Price: " + Calculate.price(Calculate.calculateConsumption(v.getFuelConsumption(),distance),fuelprice));
            System.out.println();

            // commenting mostly for myself to remember.
            //price gets the price for the first vehicle in the list.
            price = Calculate.price(Calculate.calculateConsumption(v.fuelConsumption,distance),fuelprice);
            if (cheapest == 0){ //if cheapest is zero, witch it always is from the beginning.
                cheapest = price; // cheapest sets to value of price.
                cheap = v; // and store that looped vehicle in cheap.
            }
            if (cheapest > price){ //this kicks in next loop, because now cheapest will have a value.
                                   //if cheapest is lower then price.
                cheapest = price;  //then cheapest sets to price of the current vehicle.
                cheap = v;          //and then store this current looped vehicle in cheap
                                    //now the lowest price should be stored in cheapest, and the corresponding vehicle in cheap.
            }

        }

        System.out.println(cheap.brand + " " + cheap.model + " är den billigaste, den kostar bara " + cheapest + " per sträcka");

    }

}