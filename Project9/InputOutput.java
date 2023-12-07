package Project9;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {

        File file = new File("input.txt");
        PrintStream output = new PrintStream(new File("proj9output.txt"));

        Scanner scanFile = new Scanner(file);

        int length = scanFile.nextInt();
        System.out.println("Array Length: " + length);
        int[] array = new int[length];

        System.out.println("Before we Sort: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanFile.nextInt();
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);

        System.setOut(output);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        scanFile.close();

    }
}
