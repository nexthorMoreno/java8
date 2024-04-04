package co.com.test.initial;

public class Exception_5 {

	public static void main(String[] args) {
		System.out.println("a");
		try {
			System.out.println("b");
			throw new IllegalArgumentException();//Unchecked exception
		} catch (RuntimeException e) {//Unchecked exception
			System.out.println("c");
		} finally {
			System.out.println("d");
		}
		System.out.println("e");
	} 
}
//prints out abcde 