package co.com.chapter.four.lambda;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal ("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		print(animals, a -> a.canHop());//the same of the next line but with lambda expressions
		print(animals, (Animal a) -> { return a.canHop(); }); //the same of the previous line
		print(animals, (Animal a) -> { return a.canHop(); });
		
		print(animals, new CheckIfHopper()); // pass class that does check
		
		print(animals, a -> a.canSwim()); // the same of the previous line but with lambda expressions
		print(animals, a -> ! a.canSwim()); // the same of the previous line but with negation operator
		
		//Lambdas can access local and instance variables
		System.out.println("Accesss to variables:");
		boolean wantWhetherCanHop = true;
		print(animals, a -> a.canHop() == wantWhetherCanHop);
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}