package co.com.generics.wildcard;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCards {
	public static void main(String args[]) {
		printList(Arrays.asList(new Object()));
		printList2(Arrays.asList("one", "two", "three"));
	}
	
	public static void printList(List<Object> list) {
		for (Object object : list) {
			System.out.print(object + " ");
		}
		System.out.println();
	}
	
	public static void printList2(List<?> list) {
		for (Object object : list) {
			System.out.print(object + " ");
		}
		System.out.println();
	}
	
}