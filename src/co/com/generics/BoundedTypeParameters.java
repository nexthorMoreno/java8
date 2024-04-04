package co.com.generics;

/**
 * the greater than operator (>) applies only to primitive types. To fix the problem, use a type
 * parameter bounded by the Comparable<T> interface
 *
 * @author nestormoreno
 *
 */
public class BoundedTypeParameters {

  public interface Comparable<T> {
    public int compareTo(T o);
  }

  public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
    int count = 0;
    for (T e : anArray) {
      if (e.compareTo(elem) > 0) {
        ++count;
      }
    }
    return count;
  }

}
