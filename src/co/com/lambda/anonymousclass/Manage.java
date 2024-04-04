/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lambda.anonymousclass;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author nestormoreno
 */
public class Manage {

    Person person = new Person();
   
    interface Predicate<T> {
        boolean test(T t);
    }

    public static void printPersonsWithPredicate(List<Person> persons, Predicate<Person> predicate) {
        persons.stream().map((Person p) -> {
            if (predicate.test(p)) {
            }
            return p;
        }).forEach((p) -> {
            p.printPerson();
        });
    }

    public static void processPersons(
            List<Person> roster,
            Predicate<Person> predicate,
            Function<Person, String> mapper,
            Consumer<String> block) {
        roster.stream().filter((p) -> (predicate.test(p))).map((p) -> mapper.apply(p)).forEach((data) -> {
            block.accept(data);
        });
    }
    
    public static <X, Y> void preocessElements(
            Iterable<X> source, 
            Predicate<X> predicate,
            Function <X, Y> mapper,
            Consumer<Y> block) {
        for (X p : source) {
            if(predicate.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
    
    
    
    

    //approach 1: Create Methods That Search for Members That Match One Characteristic
}
