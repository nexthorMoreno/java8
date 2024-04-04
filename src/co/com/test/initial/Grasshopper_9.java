package co.com.test.initial;

public class Grasshopper_9 {
	private String name;
	public Grasshopper_9(String n) {
		name = n;
	}

	public static void main(String[] args) {
		Grasshopper_9 one = new Grasshopper_9("g1");
		Grasshopper_9 two = new Grasshopper_9("g2");
		one = two;
		two = null;
		one = null;

	}


}