/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ShootingGame;

/**
 * This class creates the dueler name and shooting accuracy, a Boolean indicating
 * whether the dueler is still alive, and a method that sets the target to dead. 
 * @author Yifei
 * @serial 1.0.0
 * @since 08/09/2014
 */
public class Duelist {

    
    /**
     * This variable stands for the name of the player    
     */
    String name;
    /**
     * This variable stands for the accuracy of the player    
     */
    double accuracy;
    /**
     * This variable checks whether the player is alive  
     */
    boolean isAlive = true;
    /**
     * Inputs the name and accuracy of the player
     * @param name validates the name
     * @param accuracy validates the accuracy
     */
    public Duelist(String name, double accuracy) {
      this.name=name;
      this.accuracy=accuracy;
    }
    /**
     * Validates the death of player 
     */
    public void die(){
        isAlive=false;
    }
    /**
     * checks whether the player is alive 
     * @return true if the player is alive, false if the player die
     */
    public boolean isAlive(){
        return isAlive;
    }
    /**
     * validates the shoot action
     * @param target the player who is shot
     */
    public void ShootAtTarget(Duelist target){
        if(Math.random()<accuracy){
            target.die();
        }
    }  
}
