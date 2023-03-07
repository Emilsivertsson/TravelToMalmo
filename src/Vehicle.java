public abstract class Vehicle {

    String brand;
    String model;
    int speed;
    int year;

    float fuelConsumption;


    public Vehicle(String brand, String model, int speed, int year, float fuelConsumtion) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.year = year;
        this.fuelConsumption = fuelConsumtion;
    }

    public abstract float getFuelConsumption();

    public abstract int getmaxspeed();

}
