import java.awt.Toolkit;
import java.util.Scanner;

public class TextToSpeech {

    public static void main(String[] args) {
        // Take text input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text you want to read aloud: ");
        String textToRead = scanner.nextLine();

        // Read the text aloud
        readAloud(textToRead);
    }

    public static void readAloud(String text) {
        // Use the default system sound to play the text
        Toolkit.getDefaultToolkit().beep();
        System.out.println("Reading aloud: " + text);
    }
}
