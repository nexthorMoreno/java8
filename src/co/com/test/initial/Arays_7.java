package co.com.test.initial;

import java.util.ArrayList;
import java.util.List;

public class Arays_7 {
	public static void main(String[] args) {
		int[] array = {6,9,8};
		List<Integer> list = new ArrayList<>();
		list.add(array[0]);
		list.add(array[2]);
		list.set(1, array[1]);
		list.remove(0);
		System.out.println(list);
		
		short x = 4;
		float y = 3;
		double z = 2;
		System.out.println(x*y/z);
		
		short x1 = 10;
		short y1 = 3;
		System.out.println(x1/y1);
		
		boolean a = false;
		int b = 1;
		System.out.println("----");
		System.out.println(--b);
		System.out.println(++b);
		System.out.println(b--);
		System.out.println(b++);
		System.out.println(b);
	}
}