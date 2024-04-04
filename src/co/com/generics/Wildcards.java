package co.com.generics;

import java.util.List;

/**
 * On generic programming ? is called a wildcard, it represents an unknown type. The wilcards can be
 * used as the type of a parameter, field or local variable; sometimes as a return type. Never use a
 * wildcard as type argument for generic method invocation, a generic class instance creation or a
 * supertype.
 *
 * @author nestormoreno
 *
 */
public class Wildcards {

  public static void process(List<? extends Foo> list) {

  }

}
