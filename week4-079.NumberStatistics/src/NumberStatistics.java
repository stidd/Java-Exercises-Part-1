
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics(){
        
    }
    
    public void addNumber(int number){
        this.amountOfNumbers++;
        this.sum += number;
    }
    
    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }
    
    public int sum(){
         return this.sum;
    }
    
    public double average(){
        return this.sum == 0 ? 0 : (double) this.sum / this.amountOfNumbers;
    }
}
