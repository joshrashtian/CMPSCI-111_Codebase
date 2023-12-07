import java.util.Scanner;

public class CountChar {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    String sentence;
    String c;

    System.out.println("What sentence are we counting?");
    sentence = input.nextLine();
    
    System.out.println("What is the character we want to look for?");
    c = input.next();
    char letter = c.charAt(0);
    
    int total = count(sentence, letter);

    System.out.println(total);
    input.close();
    }

public static int count(String word, char letter){
    int count = 0;
    System.out.println("Sentence: " + word + ". Letter: " + letter);
    for (int j = 0; j < word.length(); j++) {
        if(letter == word.charAt(j)){
            count++;
        }
    }
    return count;
}}