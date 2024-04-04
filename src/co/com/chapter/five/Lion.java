package co.com.chapter.five;

public class Lion extends Animal implements Ianimal{

	{
		System.out.println("Initializator " + this.numberOfVictims);
		numberOfVictims = 22;
	}
	
	private int numberOfVictims = 12;

	private Lion() {
		super();
		System.out.println("Lion Constructor");
		eat();
		}
	
	private Lion(int numberOfVictims) {
		this();
		this.numberOfVictims = numberOfVictims;
	}
	
	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}
	
	@Override
	public int getAge() {
		return 10;
	}
	
	public static void main (String args[]) {
		//Lion l = new Lion();
		//Animal a = new Animal();
		//System.out.println(a.getAge());
		//System.out.println(l.getAge());
	}

	@Override
	public void run() {
		System.out.println("Override Run");
	} 
	
	static{
		final int numberOfLions = 10;
		System.out.println("Lion static block: " + numberOfLions);
	}
}