public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int count = 0;
        while(count < amount){
            System.out.print("*");
            count++;
        }
        
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i =0;
        while (i<amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
        int stars = 1;
        while(i <= height){
            printWhitespaces(height - i);
            printStars(stars);
            i++;
            stars+=2;
        }
        
        int stand = 1;
        while(stand < 3){
            printWhitespaces(height - 2);
            printStars(3);
            stand++;
        }
       
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        //printWhitespaces(5);
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
