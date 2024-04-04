package co.com.chapter.five.abstracinheritance;

public class Lion extends BigCat {

	@Override
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}

	@Override
	public String getName() {
		return "Lion";
	}
	
}
