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
public class Processo extends Thread {
    String g;
    
    public Processo(String g) {
        this.g = g;
        this.start();
    }

    public void run(){
        for(;;) System.out.println(g);
    }
    

}