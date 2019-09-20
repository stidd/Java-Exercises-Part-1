/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steventidd
 */
public class Player {
    private String playerName;
    private int goals;
    
    public Player(String playerName){
        this.playerName = playerName;
    }
    
    public Player(String playerName, int goals){
        this.playerName = playerName;
        this.goals = goals;
    }
    
    public String getName(){
        return this.playerName;
    }
    
    public int goals(){
        return this.goals;
    }
    
    public String toString(){
        return getName() + ", goals " + goals();
    }
    
}
