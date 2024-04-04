package co.com.test.initial;

public interface IhasTail_3 {
	int getTailLength();
}

abstract class Puma implements IhasTail_3 {
	protected int getTailLength() {  //not have sense a protected attribute
		return 4;
	}
}

class Cougar extends Puma {
	public static void main (String[] args) {
		Puma puma = new Puma(); //isn't possible create an instance of an abstrac class
		System.out.println(puma.getTailLength());
	}
	
	public int getTailLength(int length) {
		return 2;
	}
}