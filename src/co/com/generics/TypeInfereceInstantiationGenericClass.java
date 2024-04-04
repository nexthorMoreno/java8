package co.com.generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeInfereceInstantiationGenericClass {
  /*
   * The next approaches for declaration are valid
   */
  Map<String, List<String>> oneMap = new HashMap<String, List<String>>();

  Map<String, List<String>> twoMap = new HashMap<>();

  /**
   * The next generates a waring
   */
  Map<String, List<String>> threeHasMap = new HashMap();

  public static void main(String args[]) {

  }
}
