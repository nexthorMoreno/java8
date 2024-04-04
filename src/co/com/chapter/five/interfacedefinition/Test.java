package co.com.chapter.five.interfacedefinition;

import java.util.ArrayList;
import java.util.List;

public class Test {
	int id =0;
	String desc = "Tons";

	public static void main(String args[]) {
		List<Test> l = new ArrayList<Test>();
		Test t = new Test();
		t.desc = "Tons1";
		t.id = 1;
		l.add(t);
		
		System.out.println(l.get(0).desc);
	}
}
