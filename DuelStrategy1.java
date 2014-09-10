/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ShootingGame;

/**
 * This class constructs the duel strategy 1 
 * @author Yifei
 * @serial 1.0.0
 * @since 10/09/2014
 */
public class DuelStrategy1 {
    Duelist Godzilla = new Duelist("Godzilla",1.0/3);
    Duelist Kingkong = new Duelist("Kingkong",1.0/2);
    Duelist Spiderman = new Duelist("Spiderman",1.0);
    /**
     * simulates the fight situation 
     * @return the name of the winner
     */
    public String fight(){
    while ( (Godzilla.isAlive() && Kingkong.isAlive()) || (Kingkong.isAlive() && 
            Spiderman.isAlive()) || (Godzilla.isAlive() && Spiderman.isAlive()) ){  
        if (Godzilla.isAlive()){
            if (Spiderman.isAlive()){
                Godzilla.ShootAtTarget(Spiderman);
            } else {
                Godzilla.ShootAtTarget(Kingkong);
            }
        }
        if (Kingkong.isAlive()){
            if (Spiderman.isAlive()){
                Kingkong.ShootAtTarget(Spiderman);
            } else {
                Kingkong.ShootAtTarget(Godzilla);
            }
        }
        if (Spiderman.isAlive()){
            if (Kingkong.isAlive()){
                Spiderman.ShootAtTarget(Kingkong);
            } else {
                Spiderman.ShootAtTarget(Godzilla);
            }
        }
    }    
    
    if (Godzilla.isAlive()){
        return "Godzilla";
    } else if (Kingkong.isAlive()){
        return "Kingkong";
    } else {
        return "Spiderman";
    }
}
}
