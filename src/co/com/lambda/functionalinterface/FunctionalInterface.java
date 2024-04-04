/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lambda.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author nestormoreno
 */
public class FunctionalInterface {
    
        public static void main(String args[]) {
            List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
                   
            System.out.println("Print all numbers:");
            eval(list, n->true);
            
            System.out.println("Print even numbers:");
            eval(list, n-> n%2 == 0);
            
            System.out.println("Print numbers greater than 3:");
            eval(list, n-> n > 3);
        }
        
        public static void eval(List<Integer> list, Predicate<Integer> predicate) {
            for(Integer n: list){
                if(predicate.test(n)){
                    System.out.println(n + " ");
                }
            }
        }
    
}
