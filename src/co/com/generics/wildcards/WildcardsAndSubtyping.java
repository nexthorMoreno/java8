package co.com.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * It's possible to crate a relationship between generic classes or interfaces
 * 
 * @author nestor.moreno
 *
 */
public class WildcardsAndSubtyping {
	
	public static void main(String args[]) {
		List<? extends Integer> intList = new ArrayList<>();
		List<? extends Number>  numList = intList;  // OK. List<? extends Integer> is a subtype of List<? extends Number>
	}

}
