/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct10_Runner_thread;

/**
 *
 * @author J2EE-33
 */
public class Urmi implements Runnable{
    int i;

    @Override
    public void run() {
        i = 0;
        while(true){
            System.out.println("Urmi: " + i++);
            if(i==10){
                break;
            }
        }
    }
    
}
