/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lambda.methodreference;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nestormoreno
 */
public class MethodReference {
    
    public static void main(String args[]) {
        List names = new ArrayList();
        
        names.add("Hello");
        names.add("Hello2");
        
        names.forEach(System.out::println);
    }
    
    
}
