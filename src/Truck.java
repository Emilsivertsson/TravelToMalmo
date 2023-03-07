public class Truck extends Vehicle{

    int doors;
    int capacity;



    public Truck(String brand, String model, int speed, int year, float fuelConsumtion, int doors, int capacity) {
        super(brand, model, speed, year, fuelConsumtion);
        this.doors = doors;
        this.capacity = capacity;
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
                + "Capacity: " + capacity + "tons\n"
                + "Door count: " + doors;
    }
}
