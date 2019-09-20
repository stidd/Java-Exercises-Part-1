public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times   
         // printing --- to separate the figures
        int count = 0;
        while(count < amount){
            System.out.print("*");
            count++;
        }
        
        System.out.println();
        
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int count = 0;
        while(count < sideSize){
            printStars(sideSize);
            count++;
        }
        
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int count = 0;
        while(count < height){
            printStars(width);
            count++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int row = 1;
        while(row <= size){
            printStars(row);
            row++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
        printStars(5);
        printStars(3);
        printStars(8);
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
