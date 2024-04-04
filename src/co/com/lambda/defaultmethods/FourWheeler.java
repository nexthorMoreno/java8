/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lambda.defaultmethods;

/**
 *
 * @author nestormoreno
 */
public interface FourWheeler {
    default void print() {
        System.out.println("FourWheeler");
    }
}