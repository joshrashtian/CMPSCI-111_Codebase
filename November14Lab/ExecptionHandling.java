package November14Lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        try {
            int integer = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        
    }
}
