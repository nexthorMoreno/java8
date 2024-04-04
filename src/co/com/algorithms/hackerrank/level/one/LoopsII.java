package co.com.algorithms.hackerrank.level.one;

import java.util.Scanner;

public class LoopsII {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int temp = 0;
		String output = "";
		
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			for (int j = 0; j < n; j++) {
				temp += a + Math.pow(b, j) * b;
				output += temp + " ";
			}
			
			System.out.println(output);
			temp = 0;
			output ="";

		}
		in.close();
	}

}
