package co.com.generics.wildcard;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * lower bounded wildcard restricts the unknown type to be a 
 * specific type or a super type of that type.
 * @author nestor.moreno
 *
 */
public class LowerBoundedWildcards {
	
	public static void main(String args[]) {
		addNumbers(Arrays.asList(Collections.emptyList()));
	}
	
	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i<=10; i++) {
			list.add(i);
		}
	}

}
