
package co.com.test.initial;

public class Deer_8 {
	public Deer_8() {
		System.out.println("Deer");
	}
	
	public Deer_8(int age) {
		System.out.println("DeerAge");
	}
	
	private boolean hasHorns() {
		return false;
	}

	public static void main(String[] args) {
		Deer_8 deer = new Reindeer(5);
	}
}

class Reindeer extends Deer_8 {
	public Reindeer(int age) {
		System.out.println("Reindeer");
	}
	public boolean hasHorns() {
		return true;
	}
}