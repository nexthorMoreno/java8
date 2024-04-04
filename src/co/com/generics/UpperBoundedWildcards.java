package co.com.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * You can use an upper bounded wildcard to relax the restrictions on a variable. To declare an
 * upper-bounded wildcard, use the wildcard character ('?'), followed by the extends keyword,
 * followed by its upper bound. Note that, in this context, extends is used in a general sense to
 * mean either "extends" (as in classes) or "implements" (as in interfaces).
 *
 * @author nestormoreno
 *
 */
public class UpperBoundedWildcards {

  public static void main(String[] args) {
    List<Integer> li = Arrays.asList(1, 2, 3);
    System.out.println("sum" + sumOfList(li));

    List<Double> id = Arrays.asList(1.2, 2.3, 3.5);
    System.out.println("sum" + sumOfList(id));

    process();
  }

  public static double sumOfList(List<? extends Number> list) {
    double s = 0.0;
    for (Number n : list) {
      s += n.doubleValue();
    }
    return s;
  }

  public static void process() {
    List<Foo> list = Collections.emptyList();
    for (Foo elem : list) {
      elem.someMethod();
    }
  }

  public static void process(List<? extends Foo> list) {
    process();
  }

}
