import java.util.Scanner;

public class WeekArray {
    public static void main(String[] args){
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number 0-6:");
        int num = input.nextInt();
        System.out.println("The day of the week is " + days[num]);
        input.close();
    }
}
