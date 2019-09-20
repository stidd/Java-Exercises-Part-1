import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
//        int[] values = {6, 5, 8, 7, 11};
//        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        
//        int[] values = {-1, 6, 9, 8, 12};
//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

//        int[] values = {3, 2, 5, 4, 8};
//
//        System.out.println( Arrays.toString(values) );
//
//        swap(values, 1, 0);
//        System.out.println( Arrays.toString(values) );
//
//        swap(values, 0, 3);
//        System.out.println( Arrays.toString(values) );
    
            int[] values = {8, 3, 7, 9, 1, 2, 4};
            sort(values);

        
    }
    
    public static int smallest(int[] array){
        int smallestNum = array[0];
        for(Integer num : array){
              if(num < smallestNum){
                    smallestNum = num;
              }
        }
            
            return smallestNum;
     }
    
    public static int indexOfTheSmallest(int[] array){
        int smallestIndex = 0;
        int smallestValue = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallestValue){
                smallestValue = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] arr, int index){
        int smallestIndex = index;
        int smallestNum = arr[index];
        for(int i = index; i < arr.length; i++){
            if(arr[i] < smallestNum){
                smallestNum = arr[i];
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        
    }
    
    public static void sort(int[] arr){
        //before sorting print
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            swap(arr, i, indexOfTheSmallestStartingFrom(arr, i));
            System.out.println(Arrays.toString(arr));
        }
        
    }

}
