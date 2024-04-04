package co.com.lambda.optional;

import java.util.Optional;

/**
 * Optional: is a container of objects to contain not-null objects
 * Avoid the use of null values as is in Guava language
 * 
 * @author nestormoreno
 *
 */
public class OptionaExample {
	
	public static void main(String args[]) {
		OptionaExample.optionalTest();
	}
	
	public static void optionalTest() {
		Optional<Integer> a = Optional.ofNullable(null);
		Optional<Integer> b = Optional.ofNullable(new Integer(20));
		Optional<Integer> c = Optional.of(new Integer(10));
//		Optional<Integer> d = Optional.of(null); It returns a NullPointerException
		System.out.println(OptionaExample.sum(a, b, c));
	}
	
	public static Integer sum(Optional<Integer> a, Optional<Integer> b, Optional<Integer> c) {
		System.out.println(a.isPresent() + " == " + b.isPresent() + " == " + c.isPresent());
		
		Integer value1 = a.orElse(new Integer(0));
		Integer value2 = b.get();
		
		return value1 + value2; 
		
	}

}
