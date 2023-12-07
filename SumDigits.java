import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println("Sum of Digits = " + sumdigits(number, number));
        input.close();
    }
    public static int sumdigits(int n, int m){
        int total = 0;
        int e = 0;
        for (int i = 0; i <= m; i++) {
            m = m / 10;
            e++;
        }
        System.out.println("Number Length = " + e);
        int[] sum = new int[e];
        for (int i = 0; i <= n; i++) {
            e++;
            int extract = n % 10;
            n = n / 10;
            sum[i] = extract;
        }
        for (int i = 0; i < sum.length; i++) {
            total += sum[i];
        }
    return total;
    }
}
