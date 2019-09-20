
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        
        Scanner reader = new Scanner(System.in);
        
        while(true){
            System.out.println("name: ");
            String name = reader.nextLine();
            
            if(name.equals("")){
                break;
            }
             
            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();
            
            list.add(new Student(name, studentNumber));
            
        }
        
        for(Student std : list){
            System.out.println(std);
        }
        
        System.out.println("");
        
        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        
        for(Student std : list){
            System.out.println("Result: ");
            if(std.getName().contains(searchTerm)){
                System.out.println(std);
            }
        }
        
        
        
        
    }
}
