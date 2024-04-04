package co.com.test.initial;

public class MathFunctions_6 {

	public static void main(String[] args) {
		int a = 15;
		int b = 10;
		MathFunctions_6.addToInt(a, b);
		System.out.println(a);
	}
	
	public static void addToInt(int x, int amountToAdd) {
		x = x + amountToAdd;
	}

}
//print outs 15