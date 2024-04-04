package co.com.generics;

import java.util.Arrays;
import java.util.List;

/**
 * The unbounded wildcard type is specified using the wildcard character (?), for example, List<?>.
 * This is called a list of unknown type. There are two scenarios where an unbounded wildcard is a
 * useful approach: If you are writing a method that can be implemented using functionality provided
 * in the Object class. When the code is using methods in the generic class that don't depend on the
 * type parameter. For example, List.size or List.clear. In fact, Class<?> is so often used because
 * most of the methods in Class<T> do not depend on T.
 *
 * @author nestormoreno
 *
 */
public class UnboundedWildcards<T> {

  public UnboundedWildcards() {
    // TODO Auto-generated constructor stub
  }

  public static void main(String[] args) {
    List<Integer> li = Arrays.asList(1, 2, 3);
    List<String> ls = Arrays.asList("one", "two", "three");
    printList2(li);
    printList2(ls);
    /* In order to use printList it's necessary create a list of Object or their descendants */
  }

  /**
   * it prints only a list of Object instances; it cannot print List<Integer>, List<String>, List
   * <Double>, and so on, because they are not subtypes of List<Object>.
   *
   * @param list
   */
  public static void printList(List<Object> list) {
    for (Object elem : list) {
      System.out.println(elem + " ");
      System.out.println();
    }
  }

  /**
   * To write a generic printList method, use List<?>:
   *
   * @param list
   */
  public static void printList2(List<?> list) {
    for (Object elem : list) {
      System.out.println(elem + " ");
      System.out.println();
    }
  }

}
