package co.com.chapter;

public class Letters {

  public static void main(String args[]) {

    int n = 6;

    for (int i = 0; i < n; i++) {
      int temp = i;
      for (int j = 1; ((j < n - i)); j++) {
        System.out.print(" ");
      }

      while (temp >= 0) {
        System.out.print("#");
        temp--;
      }

      System.out.println("");
    }

  }

}
