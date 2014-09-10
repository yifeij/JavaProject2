/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ShootingGame;
import java.util.Scanner;
/**
 * This class simulates 10,000 times duels in order to count the probability of 
 * winning for each contestant.
 * @author Yifei
 * @serial 1.0.0
 * @since 10/09/2014
 */
public class main {

    /**
     * Input the DuelStrategy1 or DuelStrategy2, the results will be demonstrated.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Strategy:");
        String Strategy = input.nextLine();
        if (Strategy.equals("DuelStrategy1") ){
            /**
             * This variable counts the Godzilla‘s winning times     
             */
            int GodzillaWin = 0;
            /**
             * This variable counts the Kingkong‘s winning times     
             */
            int KingkongWin = 0;
            /**
             * This variable counts the Spiderman‘s winning times     
             */
            int SpidermanWin = 0;
            for(int i = 0; i<=10000; i++){
                DuelStrategy1 newDuelStrategy1 = new DuelStrategy1();
                switch (newDuelStrategy1.fight()) {
                    case "Godzilla":
                        GodzillaWin++;
                        break;
                    case "Kingkong":
                        KingkongWin++;
                        break;
                    case "Spiderman":
                        SpidermanWin++;
                        break;
                }
        }
        
        /**
         * @param ProbabilityGodzillaWin This variable calculates the Godzilla‘s winning probability 
         * @param ProbabilityKingkongWin This variable calculates the Kingkong‘s winning probability
         * @param ProbabilitySpidermanWin This variable calculates the Spiderman‘s winning probability
         */
        double ProbabilityGodzillaWin = (double)GodzillaWin/10000*100;
        double ProbabilityKingkongWin = (double)KingkongWin/10000*100;
        double ProbabilitySpidermanWin = (double)SpidermanWin/10000*100;
        System.out.println("Godzilla: "+GodzillaWin+"/10000 "+ProbabilityGodzillaWin + "%");
        System.out.println("Kingkong: "+KingkongWin+"/10000 "+ProbabilityKingkongWin + "%");
        System.out.println("Spiderman: "+SpidermanWin+"/10000 "+ProbabilitySpidermanWin + "%");
        }
        
        if (Strategy.equals("DuelStrategy2") ){
            /**
             * This variable counts the Godzilla‘s winning times     
             */
            int GodzillaWin = 0;
            /**
             * This variable counts the Kingkong‘s winning times     
             */
            int KingkongWin = 0;
            /**
             * This variable counts the Spiderman‘s winning times     
             */
            int SpidermanWin = 0;
            for(int i = 0; i<=10000; i++){
                DuelStrategy2 newDuelStrategy2 = new DuelStrategy2();
                switch (newDuelStrategy2.fight()) {
                    case "Godzilla":
                        GodzillaWin++;
                        break;
                    case "Kingkong":
                        KingkongWin++;
                        break;
                    case "Spiderman":
                        SpidermanWin++;
                        break;
                }
        }
        
        /**
          * @param ProbabilityGodzillaWin This variable calculates the Godzilla‘s winning probability 
          * @param ProbabilityKingkongWin This variable calculates the Kingkong‘s winning probability
          * @param ProbabilitySpidermanWin This variable calculates the Spiderman‘s winning probability
          */
        double ProbabilityGodzillaWin = (double)GodzillaWin/10000*100;
        double ProbabilityKingkongWin = (double)KingkongWin/10000*100;
        double ProbabilitySpidermanWin = (double)SpidermanWin/10000*100;
        System.out.println("Godzilla: "+GodzillaWin+"/10000 " +ProbabilityGodzillaWin + "%");
        System.out.println("Kingkong: "+KingkongWin+"/10000 " +ProbabilityKingkongWin + "%");
        System.out.println("Spiderman: "+SpidermanWin+"/10000 "+ProbabilitySpidermanWin + "%");
        }
      
}       
}
