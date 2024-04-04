package co.com.algorithms;

public class AliceAndBob2 {
  static int[] data;
  static int[] result;

  public AliceAndBob2() {
    data = new int[6];
    result = new int[2];
  }

  public static void main(String args[]) {
    new AliceAndBob2();
    int[] result = solve(5, 6, 7, 3, 6, 10);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
    }
    System.out.println("");
  }

  static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
    toArray(a0, a1, a2, b0, b1, b2);
    for (int i = 0; i < data.length / 2; i++) {
      comparator(data[i], data[i + 3]);
    }
    return result;
  }

  static int[] toArray(int a0, int a1, int a2, int b0, int b1, int b2) {
    data[0] = a0;
    data[1] = a1;
    data[2] = a2;
    data[3] = b0;
    data[4] = b1;
    data[5] = b2;
    return data;
  }

  public static void comparator(int aliceInput, int bobInput) {
    if (aliceInput > bobInput) {
      result[0] = result[0] + 1;
    }

    if (bobInput > aliceInput) {
      result[1] = result[1] + 1;
    }
  }

}
