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

public class Database {
    private ArrayList<Bird> birds;
    
    public Database(){
        this.birds = new ArrayList<Bird>();
    }
    
    public void addBird(String name, String latinName){
        for(Bird bird : this.birds){
            if(bird.getName().equals(name)){
                System.out.println("Already in database");
                return;
            }
        }
        
        birds.add(new Bird(name, latinName));
    }
    
    public void observation(String observed){
        for(Bird bird : this.birds){
            if(bird.getName().equals(observed)){
                bird.addObservation();
                return;
            }
        }
        
        System.out.println("Is not a bird!");
    }
    
    public void stats(){
        for(Bird bird : this.birds){
            System.out.println(bird);
        }
    }
    
    public void show(String name){
        for(Bird bird : this.birds){
            if(bird.getName().equals(name)){
                System.out.println(bird);
            }
        }
    }
}
