import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int average = 0;
        int[][] matrix = new int[3][3];
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns.");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
            matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            total += matrix[i][j];
            }
        }
        average = (total / (matrix.length * matrix[0].length));
        System.out.println("Total is " + total + ", and our average is " + average);
        input.close();
    }
}
