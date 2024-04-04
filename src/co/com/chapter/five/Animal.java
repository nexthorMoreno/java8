package co.com.chapter.five;

public class Animal {
	private int age;
	
	{
		System.out.println("Instance inicializator Animal");
	}

	static {
		System.out.println("Static block Animal");
	}
	
	public Animal() {
		super();
		System.out.println("Animal constructor");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}