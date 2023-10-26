public class TemperatureMethod {
    public static double Temp(double x) {
        double fahrenheit = (9/5.0) * x + 32;
        return fahrenheit;
    }
    public static void main(String [] args){
        System.out.println(Colors.ORANGE() + Temp(35) + Colors.RESET());
    }
}
