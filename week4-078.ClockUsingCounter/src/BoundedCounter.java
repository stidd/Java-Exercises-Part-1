/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void next(){
        if(this.value == upperLimit){
            this.value = 0;
        }else{
            this.value += 1;
        }
       
    }
    
    public void setValue(int value){
        if(value > 0 && value <= upperLimit){
            this.value = value;
        }
    }
    
    public String toString(){
        if(this.value < 10){
            return "" + 0 + this.value;
        }else{
            return "" + this.value;
        }
    }
}
