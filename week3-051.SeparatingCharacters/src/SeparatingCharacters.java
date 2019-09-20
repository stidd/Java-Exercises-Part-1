
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = reader.nextLine();
        
        int i = 0;
        while(i < input.length()){
            System.out.println(i + 1 + ". character: " + input.charAt(i));
            i++;
        }
        
        
        
        
    }
}
