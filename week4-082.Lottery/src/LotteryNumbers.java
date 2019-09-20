import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        
        while(this.numbers.size() < 7){
            int n = random.nextInt(39) + 1;
        
            if(!containsNumber(n)){
                this.numbers.add(n);
            }
        }
           
        
       
        
        
        
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        boolean result = false;
        for(int num : this.numbers){
            if(num == number){
                result = true;
            }
        }
        return result;
    }
}
