package co.com.chapter;

/**
 * Given an array of integers, can you find the sum of its elements?
 *
 * Input Format
 *
 * The first line contains an integer, "n" , denoting the size of the array. The second line
 * contains space-separated integers representing the array's elements.
 *
 * Output Format
 *
 * Print the sum of the array's elements as a single integer.
 *
 * Sample Input
 *
 * 6 1 2 3 4 10 11
 *
 * Sample Output
 *
 * 31
 *
 * @author nestormoreno
 *
 */
public class ArraySum {

  public ArraySum() {}

  public static void main(String args[]) {

  }

  static int simpleArraySum(int n, int[] ar) {
    int arraySum = 0;
    for (int element : ar) {
      arraySum += element;
    }
    return arraySum;
  }

}
