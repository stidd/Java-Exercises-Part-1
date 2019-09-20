import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = reader.nextLine();
        
        int i = input.length() - 1;
        String name = "";
        while(i >= 0){
            name += input.charAt(i);
            i--;
        }
        
        System.out.println("In reverse order: " + name);
    }
}
