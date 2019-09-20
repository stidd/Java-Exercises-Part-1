
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        
        
        while(firstNum <= secondNum){
            if(firstNum > secondNum){
                break;
            }
            System.out.println(firstNum);
            firstNum++;
        }
    }
}
