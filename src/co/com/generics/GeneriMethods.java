/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.generics;

/**
 * Generic methods are methods that introduce their own type parameters
 * The type parameters exists only in the scope where are declared
 * @author nestormoreno
 */
public class GeneriMethods {
    
    public class Util {
        /**
         * Generic method
         * @param <K>
         * @param <V>
         * @param p1
         * @param p2
         * @return 
         */
        public <K, V> boolean compaare(Pair<K, V> p1, Pair<K, V> p2) {
            return p1.getKey().equals(p2.getKey()) && 
            p1.getValue().equals(p2.getValue());
        }
    }
    
    public class Pair<K, V> {
        private K key;
        private V value;
        
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    
        public void setKey(K key) {
            this.key = key;
        }
        
        public void setValue(V value) {
            this.value = value;
        }
        
        public K getKey() {
            return key;
        }
        
        public V getValue() {
            return value;
        }
        
        public void invoke() {
            Util util = new Util();
            Pair<Integer, String> p1 = new Pair<>(1, "Hello");
            Pair<Integer, String> p2 = new Pair<>(2, "World");
            boolean same = util.compaare(p1,p2);
            System.out.println("Are the same: " + same);
        }

    }
    
}
