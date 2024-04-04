package co.com.generics.wildcard;

import java.util.List;

/**
 * Compiler infers the type of a wildcard.
 * @author nestor.moreno
 *
 */
public class WildcardCapture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * It generates a capture exception
	 * @param i
	 */
//	void foo(List<?> i) {
//		i.set(0,i.get(0));
//	}
	
	<T> void foo2(List<T> i) {
		fooHelper(i);
	}
	
/**
 * Create a helper to solve the capture exception
 * @param list
 */
	private static <T> void fooHelper(List<T> list) {
		list.set(0, list.get(0));
	}
	
}
