import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
            int[] original = {1, 2, 3, 4};
            int[] reverse = reverseCopy(original);

            // print both
            System.out.println( "original: " +Arrays.toString(original));
            System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
    public static int[] copy(int[] array){
        int[] copyOfArr = new int[array.length];
        for(int i = 0; i < array.length; i++){
            copyOfArr[i] = array[i];
        }
        
        return copyOfArr;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] reversed = new int[array.length];
        
        for(int i = 0; i < reversed.length; i++){
            reversed[i] = array[array.length - 1 - i];
        }
        
        return reversed; 
      
    }
}
