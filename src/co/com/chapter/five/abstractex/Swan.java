package co.com.chapter.five.abstractex;

public class Swan extends Animal {

	@Override
	public String getName() {
		return "Tons2";
	}
	
	public static void main( String args[]) {
		Swan s = new Swan();
		Animal a = new Animal() {
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "Tons";
			}
		};
		
		System.out.println(" " + a.eat("Tons"));
		System.out.println(s.getName());
		System.out.println(a.getName());
	}

}
