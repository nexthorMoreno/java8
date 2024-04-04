/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lambda.defaultmethods.defaultmethod2;

/**
 *
 * @author nestormoreno
 */
interface Vehicle {
    default void print(){
      System.out.println("I am a vehicle!");
   }
    
    static void blowHorn() {
        System.out.println("Blowing horn!!");
    }
    
}
