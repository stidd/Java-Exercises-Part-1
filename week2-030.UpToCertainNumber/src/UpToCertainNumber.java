
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number? ");
        int userInput = Integer.parseInt(reader.nextLine());
        int i = 1;
        while(i <= userInput){
            System.out.println(i);
            i++;
        }
        
    }
}
