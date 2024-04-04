package co.com.chapter.assessment;

public class One {
	private static int $; //is valid instance variable
	private static int a_b;

	public static void main(String[] main) {
		String a_b;
		System.out.print($);
		System.out.print(a_b); //this line doesn't compile regarding a_b variable wasn't initialized
	}
}