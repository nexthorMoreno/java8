/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lambda.starter;
/**
 *
 * @author nestormoreno
 */
public class Salutation {
    
    final static String salutation = "Hello";
    
    public static void main (String args[]) {
        GreetingService greetingService = message -> 
                System.out.println(salutation + message);
        greetingService.sayMessage("Helloooo");
    }
    
}
