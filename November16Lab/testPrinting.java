package November16Lab;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class testPrinting{
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        Scanner data = new Scanner(file);  
        System.out.println(data.next());
        System.out.println(data.next());
        System.out.println(data.next());
    }
}