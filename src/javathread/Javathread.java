/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author miele.riccardo
 */
public class Javathread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Processo T1 = new Processo("T1");
    Processo T2 = new Processo("T2");
    
    T1.start();
    T2.start();
    
    }  
}
