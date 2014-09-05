/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;

/**
 *
 * @author Yifei
 * @serial 1.0.0
 * @since 05/08/2014
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int T , O, G, D;
        for ( T=0; T<10; T++ ) {
            for ( O=0; O<10; O++ ){
                for ( G=0; G<10; G++ ){
                    for ( D=0; D<10; D++ ){
                        if ((T*100+O*10+O)*4 == (G*1000+O*100+O*10+D)) {
                            if (T!=O && T!=G && T!=D && O!=G && O!=D && G!=D) {
                                System.out.println("T is "+T+","+ "O is "+O+","+ "G is "
                                        +G+","+ "D is "+D+"." );
                            }
                        }
                    }
                }
            }
        }       
    }
}   
