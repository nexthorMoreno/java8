package co.com.books.effectivejava.chapters.two;

import java.util.EmptyStackException;

/**
 *
 * @author nestormoreno
 *
 */
public class EliminateObsoleteObjectReferences {
  int size;
  Object[] elements;

  public Object pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }

    Object result = elements[--size];
    elements[size] = null; // Eliminate obsolete reference
    return result;
  }

  public static void main(String args[]) {
    EliminateObsoleteObjectReferences e = new EliminateObsoleteObjectReferences();
    e.pop();
  }

}
