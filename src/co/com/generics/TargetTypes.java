package co.com.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TargetTypes<X> {

  /**
   * This is a generic constructor
   *
   * @param t
   */
  public <T> TargetTypes(T t) {

  }

  public static void main(String[] args) {
    List<String> listOne = Collections.emptyList();
    listOne.size();

    List<String> listTwo = Collections.<String>emptyList();
    listTwo.size();

    new TargetTypes<>("");
    TargetTypes<Integer> obj = new TargetTypes<>("");
    System.out.println(obj);
    TargetTypes t = new TargetTypes("");
    t.precessStringList(Arrays.asList("", ""));
    t.precessStringList(Collections.emptyList());
    t.precessStringList(Collections.<String>emptyList());
  }

  public void precessStringList(List<String> stringList) {

  }

}
