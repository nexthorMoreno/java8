package co.com.generics;

public class GenericMethodTest {

  public static <E> void printArray(E[] inputArray) {
    for (E element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }

  /**
   * When I call the generic method, always i pass a type as parameter
   * @param args 
   */
  public static void main(String args[]) {
    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
    Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

    System.out.println("Array integerArray contains");
    printArray(intArray);

    System.out.println("\nArray doubleArray contains:");
    printArray(doubleArray);

    System.out.println("\nArray characterArray contains:");
    printArray(charArray);
  }

}