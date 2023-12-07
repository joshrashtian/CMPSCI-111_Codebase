import java.util.Scanner;

public class MinDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("For Method #1, enter number 1:");
        int first = input.nextInt();

        min(first, (int)(Math.random() * 30), (int)(Math.random() * 30));

        min((int)(Math.random() * 50), (int)(Math.random() * 50));

        input.close();
    }

   public static void min(int num1, int num2) {
    System.out.println(Colors.ORANGE() + "The two value are " + num1 + " , " + num2);
    if(num1 > num2){
        System.out.println(Colors.ORANGE() + "Number 1 is the highest " + num1 + Colors.RESET());
    } else {
        System.out.println(Colors.ORANGE() + "Number 2 is the highest " + num2 + Colors.RESET());
    }
   }
   public static void min(int num1, int num2, int num3) {
    System.out.println("The three value are " + num1 + " , " + num2 + " , " + num3);
    if(num1 > num2){
        if(num1> num3){
            System.out.println("Number 1 is the highest " + num1);
        } else {
            System.out.println("Number 3 is the highest " + num1);
        }
    } else if (num2 > num1){
        if(num2 > num3){
            System.out.println("Number 2 is the highest " + num1);
        } else {
            System.out.println("Number 3 is the highest " + num1);
        }
    }
   }
}
