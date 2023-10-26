import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args){
        String name = GUI("input", "Enter Your Username:");

        JOptionPane.showConfirmDialog(null, "Are you ready to be tested?", "DMV Test Taker", 1, 3);
    
    }

    public static String GUI(String type, String message){
        String result;
        if(type == "input"){
        result = JOptionPane.showInputDialog(message);
        } else {
            System.out.println(Colors.RED() + "Error: Couldn't run GUI" + Colors.RESET());
            result = "null";
        }
        return result;
    }
}
