/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> gradesDist;
    private int[] totals = new int[6];
    
    // constructor
    public Grades(){
        this.gradesDist = new ArrayList<Integer>();
    }
    
   
    
    // map scores (determine how many of each category)
    public void calcGrades(ArrayList<Integer> scores){
        for(Integer score : scores){
            if(score <= 29){
                gradesDist.add(0);
            }else if(score <= 34){
                gradesDist.add(1);
            }else if(score <= 39){
                gradesDist.add(2);
            }else if(score <= 44){
                gradesDist.add(3);
            }else if(score <= 49){
                gradesDist.add(4);
            }else if(score <= 60){
                gradesDist.add(5);
            }
        }
        
        calcDistribution();
    }
    
    public void calcDistribution(){
        for(int i = 0; i < totals.length; i++){
            for(Integer score : this.gradesDist){
                if(i == score){
                    totals[i] += 1;
                }
            }
        }
        
        printDistribution();
    }
    
    
    public void printDistribution(){
        System.out.println("Grade distribution: ");
        for(int i = 5; i >= 0; i--){
            System.out.println(i + ": " + lineOfStars(totals[i]));
        }
        System.out.println(acceptancePercentage());
    }
    
    // create line of stars 
    public String lineOfStars(int numOfStars){
        String stars = "";
        for(int i = 0; i < numOfStars; i++){
            stars+= "*";
        }
        return stars;
    }
    
    public String acceptancePercentage(){
        int accepted = 0;
        for(Integer score : this.gradesDist){
            if(score > 0){
                accepted++;
            }
        }
        if(accepted == 0){
            return "Acceptance percentage: " + 0.0;
        }
        double percentage = 100*accepted/this.gradesDist.size();
        return "Acceptance percentage: " + percentage;
    }
    
    
    
    
    
}
