/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lambda.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author nestormoreno
 */
public class MapExample {
    
    public static void main(String args[]) {
        MapExample m = new MapExample();
        m.test();
        m.test2();
    }
    
    public String test() {
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", ")); 
        System.out.println(G7Countries); 
        return G7Countries;
    }
    
    public void test2() {
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
        List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList()); 
        System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, distinct);
    }
    
}
