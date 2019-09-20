/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
import java.lang.Math; 

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int totalStars;
    
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height){
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine(){
        
        if(this.density == 1){
            for(int i = 0; i < this.width; i++){
                System.out.print("*");
                totalStars++;
            }
        }else{
           for(int i = 0; i < this.width; i++){
                int random = (int) (Math.random() * (density * 100) + 1);

                if(random == 1){
                    System.out.print("*");
                    totalStars++;
                }else{
                    System.out.print(" ");
                }
            }
        }
        

    }
    
    public void print(){
        this.totalStars = 0;
        for(int i = 0; i < this.height; i++){
           printLine();
           System.out.println(" ");
        }
        
    }
    
    public int starsInLastPrint(){
        return this.totalStars;
    }
    
    
}
