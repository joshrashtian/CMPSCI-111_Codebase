import java.util.Scanner;

public class MultiplicationQuiz {
 
public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    int i;
    int num1;
    int num2;
    int answer;
    double amountcorrect = 0;

    for(i = 0; i < 10; i++){
        num1 = (int)(Math.random() * 13);
        num2 = (int)(Math.random() * 13);
    
        System.out.println(Colors.ORANGE() + "Question #" + (i + 1));
        System.out.println(Colors.RESET() + "What is " + num1 + " * " + num2 + "?");
        answer = input.nextInt();

        if(answer == (num1 * num2)){
            System.out.println(Colors.GREEN() + "Correct!" + Colors.RESET());
            amountcorrect++;
        } else {
            System.out.print(Colors.RED() + "Incorrect Answer. " + Colors.RESET() + "The answer was " + (num1 * num2) + ".");
        }
        System.out.println("Onto the next question:");
    }

    System.out.println("Overall, your score was " + amountcorrect + "/10, with an average of " + (amountcorrect/10 * 100) + "%");

    input.close();
}
}