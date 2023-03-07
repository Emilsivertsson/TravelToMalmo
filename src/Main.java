import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        double distance = 272;
        double fuelprice = 19.85;

        //Car volvo = new Car("Volvo","S90", 180, 2016, 8.0F,4);
        //Truck scania = new Truck("Scania", "R450",100, 2019,35f,4,12000);
        //Motorcycle kawasaki = new Motorcycle("Kawasaki", "Ninja ZT-10R",300,2020,6.0f, true);

        //System.out.println(Calculate.calculateConsumption(volvo.fuelConsumption,distance));

        //System.out.println(Calculate.price(Calculate.calculateConsumption(volvo.fuelConsumption,distance),fuelprice));

        ArrayList <Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Volvo","S90", 180, 2016, 8.0F,4));
        vehicles.add(new Truck("Scania", "R450",100, 2019,35f,4,12));
        vehicles.add(new Motorcycle("Kawasaki", "Ninja ZT-10R",300,2020,6.0f, true));

        for (Vehicle v: vehicles) {
            System.out.println(v);
            System.out.println("Travel distance: " + distance + "km");
            System.out.println("Fuel nedded: " + Calculate.calculateConsumption(v.fuelConsumption,distance));
            System.out.println("Price: " + Calculate.price(v.fuelConsumption,fuelprice));
            System.out.println();
        }

    }

}