public class TuitionCalculation {
    public static void main(String[] args){
        double tuition = 10000;
        int year;
        double calcuated = 0;

        for(year = 1; year < 10; year++){
        tuition = tuition * 1.06;
        System.out.println("Your tuition for Year " + year + " is " + tuition);
            if(year > 6){
            calcuated = calcuated + tuition;
            }
        }
        System.out.println("Overall, your tuition in 10 years is " + tuition);
        System.out.println("Your combined total for the last 4 years is " + calcuated);
    }
}
