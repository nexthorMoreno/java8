package co.com.generics;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Type inference is a Java compiler's ability to look at each method invocation and corresponding
 * declaration to determine the type argument (or arguments) that make the invocation applicable.
 * 
 * @author nestormoreno
 *
 */
public class TypeInference {

  public static void main(String[] args) {
    /**
     * This call references that the type of the second param is Serializable
     */
    Serializable s = pick("d", new ArrayList<String>());
    s.toString();

  }

  static <T> T pick(T a1, T a2) {
    return a2;
  }

}
