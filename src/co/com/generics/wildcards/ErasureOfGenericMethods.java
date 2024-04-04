package co.com.generics.wildcard;

import java.util.Arrays;

/**
 * The Java compiler also erases type parameters in generic
 * method arguments. Consider the following generic method:
 * @author nestor.moreno
 *
 */
public class ErasureOfGenericMethods <T>{

	public ErasureOfGenericMethods() {

	}
	
	public static void main(String[] args) {
		Number[] arr = new Number[5];
		arr = (Number[]) Arrays.asList(1,2,3,4).toArray();
		System.out.println(count(arr, 15));
	}
	
	/**
	 * This method is bounded, the compiler erases type parameters in generic
	 * method arguments: replaces the params as Object as show the count2 method:
	 * 
	 * @param array
	 * @param element
	 * @return
	 */
	public static <T> int count(T[] array, T element) {
		int counter = 0;
		for (T t : array) {
			if(t.equals(element)) {
				++counter;
			}
		}
		return counter;
	}
	
	/**
	 * 
	 * @param array
	 * @param element
	 * @return
	 */
	public static int count2(Object[] array, Object element) {
		int counter = 0;
		for (Object t : array) {
			if(t.equals(element)) {
				++counter;
			}
		}
		return counter;
	}

}
