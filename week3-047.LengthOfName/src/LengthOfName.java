
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Type your name: ");
        String input = reader.nextLine();
        System.out.println("Number of characters: " + calculateCharacters(input));
        
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String input){
        return input.length();
    }
}
