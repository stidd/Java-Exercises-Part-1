import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        int sum = 0;
        int howMany = 0;
        double avg;
        int evens = 0;
        int odds = 0;
        
        System.out.println("Type numbers: ");
        while(true){
           
            int input = Integer.parseInt(reader.nextLine());
        
            if(input == -1){
               System.out.println("Thank you and see you later!");
               System.out.println("The sum is " + sum);
               System.out.println("How many numbers: " + howMany);
               avg = (double) sum / howMany;
               System.out.println("Average: " + avg);
               System.out.println("Even numbers: " + evens);
               System.out.println("Odd numbers: " + odds);
               break;
            }
            
            if(input % 2 == 0){
                evens++;
            }else{
                odds++;
            }
            
            howMany++;
            sum += input;
            
            
            
        }
       
       
        
        
        
        
    }
}
