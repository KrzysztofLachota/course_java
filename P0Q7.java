public class P0Q7 {
    /**
     * Converts from Fahrenheit to Celsius degrees
     * @param temp
     * @return temperature in Celsius degrees
     */
    public static double fahrenheitToCelsius(double temp){
        double res = 5.0/9.0*(temp-32.0);
        return res;
    }

    /**
     * Prints temperature expressed in Fahrenheit and then Celsius degrees
     * @param temp
     */
    public static void printTemperature(double temp) {
        String res="F: "+ temp;
        res += " C: "+ fahrenheitToCelsius(temp);
        System.out.println(res);
    }

    public static void main(String[] args) {
        //System.out.println("Hello world !");
        printTemperature(80.0);
    }
}
