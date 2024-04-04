package co.com.algorithms.hackerrank.level.one;

import java.util.Scanner;

public class OutputFormatting {
	private static final String FIVESPACES = "     ";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer sizeX = null;
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			Integer x = sc.nextInt();
			sizeX = x.toString().length();

			if (s1.length() < 10) {
				while (s1.length() < 10) {
					s1 += " ";
				}
				s1 += FIVESPACES;
			} else {
				s1 += FIVESPACES;
			}

			if (sizeX == 0) {
				System.out.println(s1 + "000" + x);
			} else if (sizeX == 2) {
				System.out.println(s1 + "0" + x);
			} else if (sizeX == 1) {
				System.out.println(s1 + "00" + x);
			} else {
				System.out.println(s1 + x);
			}
			// Complete this line
		}
		System.out.println("================================");
	}
}
