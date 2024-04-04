/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package co.com.generics;

/**
 *
 * @author nestormoreno
 */
public class MultipleTypeParameters {

  public interface Pair<K, V> {
    public K getKey();

    public V getValue();
  }

  public class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public K getKey() {
      return key;
    }

    @Override
    public V getValue() {
      return value;
    }

    /**
     * Use of Order pair
     */
    public void instantiate() {
      Pair<String, Integer> p1 = new OrderedPair<>("Even", 8);
      new OrderedPair<>("Hello", "World");
      System.out.println("The key is" + p1.getKey());
      System.out.println("The value is" + p1.getValue());
      // example of an parameterized type
      // OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>(...));
    }
  }

  /**
   * Creating a local instance of an enclosing type
   *
   * @param args
   */
  public static void main(String args[]) {
    MultipleTypeParameters multipleObj = new MultipleTypeParameters();
    Pair<String, String> orderedPair = multipleObj.new OrderedPair<>("Tons", "Que");
    System.out.println("Key: " + orderedPair.getKey());
    System.out.println("Value: " + orderedPair.getValue());

    ((OrderedPair<String, String>) orderedPair).instantiate();
  }

}
