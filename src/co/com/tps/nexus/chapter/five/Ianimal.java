package co.com.tps.nexus.chapter.five;

public interface Ianimal {

	default void eat() {
		System.out.println("Ianimal Eating!!!");
	}
	
	
	default void eat2() {
		System.out.println("Ianimal Eating2!!!");
	}
	
	public void run();
	
}
