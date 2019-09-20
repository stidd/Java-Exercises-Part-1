import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = reader.nextLine();
        if(input.length() < 3){
            System.out.println("");
        }else{
            int i = 1;
            while(i <= 3){
                System.out.println(i + ". character: " + input.charAt(i - 1));
                i++;
            }
        }
       
    }
}
