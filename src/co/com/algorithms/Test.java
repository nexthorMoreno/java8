package co.com.algorithms;

import java.util.Arrays;

class Test {
  // Write a method that returns the last index
  // at which "subArray" starts in "array".
  // The "array" should contain all elements of
  // "subArray" in their same order.
  static int findArray(int[] array, int[] subArray) {
    return toString(array).lastIndexOf(toString(subArray));
  }

  public static String toString(int[] array) {
    return Arrays.toString(array)
        .replace(", ", "")
        .replace("[", "")
        .replace("]", "");
  }

  public static void main(String[] args) throws java.lang.Exception {
    System.out.println(findArray(new int[] {4, 9, 3, 7, 8}, new int[] {3, 7}));
    System.out.println(findArray(new int[] {1, 3, 5}, new int[] {1}));
    System.out.println(findArray(new int[] {7, 8, 9}, new int[] {8, 9, 10}));
    System.out.println(findArray(new int[] {4, 9, 3, 7, 8, 3, 7, 1}, new int[] {3, 7}));
  }
}
