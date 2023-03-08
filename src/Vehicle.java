public abstract class Vehicle implements Stats {

    String brand;
    String model;
    int speed;
    int year;

    float fuelConsumption;


    public Vehicle(String brand, String model, int speed, int year, float fuelConsumption) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.year = year;
        this.fuelConsumption = fuelConsumption;
    }

    public abstract float getFuelConsumption();

    public abstract int getmaxspeed();

}
