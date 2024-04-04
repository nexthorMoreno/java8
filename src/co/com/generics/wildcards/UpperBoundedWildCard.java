package co.com.generics.wildcard;

import java.util.Arrays;
import java.util.List;

/**
 * Relax the restriction on a variable using extends with the upper bounded type
 * upper bounded wildcard restricts the unknown type to be a specific type or a 
 * subtype of that type and is represented using the extends keyword
 * @author nestor.moreno
 *
 */
public class UpperBoundedWildCard {
	
	public static void main(String args[]) {
		System.out.println(sumOfList(Arrays.asList(1,2,3,4.2)));
//		process(Arrays.asList(new Foo().id));
	}
	
	public static void process(List<? extends Foo> list) {
		for(Foo elem : list) {
			System.out.println(elem);
		}
	}
	
	public static double sumOfList(List<? extends Number> list) {
		double sum = 0.0;
		
		for(Number number : list) {
			sum += number.doubleValue();
		}
		return sum;
	}

}