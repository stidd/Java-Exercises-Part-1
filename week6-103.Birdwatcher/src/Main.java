import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner scanner = new Scanner(System.in);
        
        Database databaseOfBirds = new Database();
    
        while(true){
            System.out.println("? ");
            String input = scanner.nextLine();
            
            if(input.equals("Add")){
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Latin Name: ");
                String latinName = scanner.nextLine();
                
                databaseOfBirds.addBird(name, latinName);
            }else if(input.equals("Observation")){
                System.out.println("What was observed:?");
                String name = scanner.nextLine();
                
                databaseOfBirds.observation(name);
            }else if(input.equals("Statistics")){
                databaseOfBirds.stats();
            }else if(input.equals("Show")){
                System.out.println("What? ");
                String name = scanner.nextLine();
                databaseOfBirds.show(name);
            }else if(input.equals("Quit")){
                break;
            }
            
        }
    
    
    
    }

}
