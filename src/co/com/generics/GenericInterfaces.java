package co.com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericInterfaces<E> {

  public static void main(String args[]) {
    GenericInterfaces gi = new GenericInterfaces();
    new Object();
    new Integer(10);
    gi.someMethod(new Integer(10));
    gi.someMethod(new Double(10.3));

  }

  interface PayloadList<E, P> extends List<E> {
    void setPayload(int index, P val);
  }

  /**
   * This is an example of subtyping over generic classes The subtyping for generic classes of
   * interfaces is generated extending or implementing it
   */
  public void genericSubtyping() {
    List<E> array1 = new ArrayList<E>();
    System.out.println(array1.get(0));
    // PayloadList<String, String> p = new String();
    // PayloadList<String, Integer> p = new String();
    // PayloadList<String, Exception> p = new String();
  }

  public void someMethod(Number n) {

  }

  /**
   * Using Number abstract class as parameter let us to lead with the primitive types as parameters
   */
  public void genericSubtypes() {
    Box<Number> box = new Box<Number>();
    box.add(new Integer(10));
    box.add(new Double(10.1));
  }

  /**
   * This method does not could accept parameter like Box<Integer> or Box<Double> The reason is that
   * these two types aren't subtypes of Box<Number>. The parent clas for Box<Integer> or Box
   * <Double> is Object
   *
   * @param n
   */
  public void boxTest(Box<Number> n) {

  }

}
