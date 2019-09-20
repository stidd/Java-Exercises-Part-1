import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(input));
    }
    
    public static char lastCharacter(String input ){
        return input.charAt(input.length() - 1);
    }
}
