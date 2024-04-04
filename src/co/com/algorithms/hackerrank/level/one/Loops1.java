package co.com.algorithms.hackerrank.level.one;

import java.util.Scanner;

public class Loops1 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (2 <= N && N <= 20) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(N + " x " + i + " = " + (N * i));
			}
		} else {

		}

		scanner.close();
	}

}
