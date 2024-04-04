/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.lambda.setdata;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author nestormoreno
 */
public class Test {
    
    public static void main(String arg[]) {
        Test t = new Test();
        System.out.print(t.test());
        t.example3();
    }
    
    public String test() { 
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");
        return list.stream()
                .filter("d"::equals)
                .findAny()
                .map(v -> "match the value")
                .orElse(null);
    }
    
    public String test2() {
        
        
        return null;
    }
    
    public void example3(){ 
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        
        System.out.println("Languages which starts with J :");
        filter(languages, (str)->((String) str).startsWith("J"));
        System.out.println("Languages which ends with a ");
        filter(languages, (str)->((String) str).endsWith("a"));
        System.out.println("Print all languages :");
        filter(languages, (str)->true);
        System.out.println("Print no language : ");
        filter(languages, (str)->false);
        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str)->((String) str).length() > 4);
    }

    public static void filter(List names, Predicate condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
     }
    
}
