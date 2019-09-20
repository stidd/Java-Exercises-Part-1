import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Integer> scores = new ArrayList<Integer>();
        
        
        System.out.println("Type exam scores, -1 completes: ");
        
        
        
        
        while(true){
            int input = Integer.parseInt(reader.nextLine());
            
            if(input >= 0){
                scores.add(input);
            }
            
            
            // pass number to an arraylist within another java class
            
            if(input == -1){
                //show distribution 
                Grades distribution = new Grades();
                distribution.calcGrades(scores);
                break;
            }
        }
        
        
        
    }
}
