
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
        // sum of the powers
        int power = 0;
        int sum = 0;
        
        while(power <= input){
            sum = sum + (int) Math.pow(2, power);
            power++;
        }
        
        
        
        System.out.println(sum);
        
        
        
    }
}
