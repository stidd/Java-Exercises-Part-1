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

public class Team {
    private String teamName;
    private ArrayList<Player> theTeam;
    private int maxSize;
    
    public Team(String teamName){
        this.teamName = teamName;
        this.theTeam = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public void addPlayer(Player player){
        if(theTeam.size() < this.maxSize){
            this.theTeam.add(player);
        }
        
    }
    
    public void printPlayers(){
        for(Player name : this.theTeam){
            System.out.println(name);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return this.theTeam.size();
    }
    
    public int goals(){
        int total = 0;
        for(Player player : this.theTeam){
            total += player.goals();
        }
        return total;
    }
    
    public String getName(){
        return this.teamName;
    }
    
}
