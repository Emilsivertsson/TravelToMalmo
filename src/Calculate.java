public class Calculate {

    //** Used to calculate the amount of fuel required for a one way trip = distance */

    public static float calculateConsumption(float consumption, double distance){
        return (float) ((consumption /100) *distance);
    }

    /** Used to calculate price for a one way trip, using total amount of fuel and the cost per liter */
    public static float price(float totalfuel, double price){
        return (float) (totalfuel * price);
    }


}
