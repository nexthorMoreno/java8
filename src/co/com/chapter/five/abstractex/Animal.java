package co.com.chapter.five.abstractex;

public abstract class Animal {
	
	protected int age; 
	
	public Animal() {
		age = 10;
	}
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public String eat(String food) {
		return food;
	}
	
	public abstract String getName();
	
}
