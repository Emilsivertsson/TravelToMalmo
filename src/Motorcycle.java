public class Motorcycle extends Vehicle{

    boolean windshield;

    public Motorcycle(String brand, String model, int speed, int year, float fuelConsumtion, boolean windshield) {
        super(brand, model, speed, year, fuelConsumtion);
        this.windshield = windshield;
    }

    @Override
    public float getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public int getmaxspeed() {
        return speed;
    }

    @Override
    public String toString() {
        return brand + " " + model +"("+ year + ")\n"
                + "MaxSpeed: " + speed + "km/h\n"
                + "Fuel consumption: " + fuelConsumption + "l/100km\n"
                + "Has windshield" + " " + windshield;
    }
}
