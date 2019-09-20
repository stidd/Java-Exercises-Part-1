import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            
            if(word.equals("")){
                Collections.reverse(words);
                break;
            }
          
            words.add(word);
            
        }
        
        System.out.println("You typed the following words: " );
        for(String word: words){
            System.out.println(word);
        }
        
        
        
    }
}
