/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lambda;

/**
 *
 * @author nestormoreno
 */
public class Basic {

    interface MathOperation {
        int operation(int a, int b);
    }

    public static void main(String args[]) {
        MathOperation addition = (int a, int b) -> {
            return a * b;
        }; // takes two integers and returns their multiplication
        MathOperation substarction = (a, b) -> a - b; // takes two numbers and returns their difference
        //MathOperation = () -> 99;        // takes no values and returns 99
        //(String c) -> System.out.println(c); // takes a string, prints its value to the console, and returns nothing
        //a -> 2 * a; // takes a number and returns the result of doubling it
       /* c -> {      //some complex statements
;
            }
    }*/

    }
}
