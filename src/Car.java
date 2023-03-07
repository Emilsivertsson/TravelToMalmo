public class Car extends Vehicle{

    int doors;

    public Car(String brand, String model, int speed, int year , float fuelConsumtion, int doors) {
        super(brand, model, speed, year, fuelConsumtion);
        this.doors = doors;
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
                + "Door count: " + doors;
    }
}
