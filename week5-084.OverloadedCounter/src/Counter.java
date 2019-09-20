/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class Counter {
    
    private int startingValue;
    private boolean check;
    
    public Counter(int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue){
        this(startingValue, false);
    }
    
    public Counter(boolean check){
        this(0, check);
    }
    
    public Counter(){
        this(0, false);
    }
    
    public int value(){
        return this.startingValue;
    }
    
    public void increase(){
        increase(1);
    }
    
    public void increase(int increaseAmount){
        if(increaseAmount < 0){
            
        }else{
            this.startingValue += increaseAmount;
        }
        
    }
    
    public void decrease(){
        decrease(1);
//        if(check){
//            if(this.startingValue <= 0){
//                
//            }else{
//                startingValue--;
//            }
//        }else{
//            if(this.startingValue < 0){
//                
//            }else{
//                this.startingValue--;
//            }
//            
//        }
    }
    
    public void decrease(int decreaseAmount){
        if(check){
            if(this.startingValue <= 0){
                
            }else if((this.startingValue - decreaseAmount) < 0){
                this.startingValue = 0;
            }else{
                this.startingValue -= decreaseAmount;
            }
        }else{
            if(decreaseAmount < 0){
                
            }else{
                this.startingValue-=decreaseAmount;
            }
            
        }
    }
    
    public String toString(){
        return "counter: " + this.startingValue + "\n" + "check: " + this.check;
    } 
    
    
    
}
