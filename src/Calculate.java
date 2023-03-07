public class Calculate {

    public static float calculateConsumption(float consumption, double distance){
        return (float) ((consumption /100) *distance);
    }

    public static float price(float totalfuel, double price){
        return (float) (totalfuel * price);
    }


}
