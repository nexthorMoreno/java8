/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lambda.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Stream is a abstract layer. Let us process data in a declarative way let us
 * use multicore architecture without special implementations. Stream represents
 * a sequence of objects from a source, witch supports aggregate operations
 * (group operations). -> filter, map, limit, reduce, find, match... Streams
 * never stores the elements. Streams operations returns streams. collec()
 * method finish the stream Stream operations do the iterations internally over
 * the source elements provided. Collections insterface has two methods to
 * generate a Stream -> stream(), and parallelStream()
 *
 * @author nestormoreno
 */
public class Stream1 {

    public static void main(String arg[]) {
        Stream1 obj = new Stream1();
        obj.one();
        obj.limitUse();
        obj.mapUse();
        obj.filterUse();
        obj.sortedUse();
        obj.parallelProcessing();
        obj.collectorsUse();
    }

    public void one() {
        List<String> strings = Arrays.asList("a", "", "c", "d", "", "F");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty() && !string.equalsIgnoreCase("d")).collect(Collectors.toList());
        strings.forEach(System.out::print);
        System.out.println();
        filtered.forEach(System.out::print);
        
    }
    
    public void limitUse() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
    
    /**
     * calculates the sqrt operation of every item in the array
     */
    public void mapUse() {
        List<Integer> numbers = Arrays.asList(3,4,5,6,3,6,9);
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);
    }
    
    /**
     * Counts empty input params
     */
    public void filterUse() {
        List<String> strings = Arrays.asList("abc", "", "de", "", "", "efg", "abcde");
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("Filter: " + count);
    }
   
    public void sortedUse() {
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
    
    public void parallelProcessing() {
        List<String> strings =  Arrays.asList("","a", "b", "", "1", "ab2");
        long count = strings.parallelStream().filter(i -> i.isEmpty()).count();
        System.out.println(count);
    }
    
    /**
     * Used for return data
     * Collectors.joining returns a String object
     */
    public void collectorsUse() {
        System.out.println("Collectors: ");
        List<String> strings = Arrays.asList("","a", "b", "", "1", "ab2");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        
        System.out.println("Filtered List: " + filtered);
        
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining("<(+)> "));
        System.out.println("Merged String: " + mergedString);
    }
    
    public void statisticsUse() {
        List<Integer> numbers = Arrays.asList(3,2,3,4,5,5,6,7,8,8,5,34);
        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
        
        IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();
        
        
    }

}
