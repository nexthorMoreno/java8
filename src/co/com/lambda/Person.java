package co.com.lambda;

import java.time.LocalDate;
import java.util.List;

public class Person {
	
	public enum Sex {
		MALE, FEMALE
	}
	
	String name;
	LocalDate birthDay;
	Sex gender;
	String emailAddress;

	public int getAge() {
		
		return 0;
	}
	
	public void printPerson(Person p) {
		System.out.println(p);
	}
	
	public void printPersonsOlderThan(List<Person> roster, int age) {
		for(Person p: roster) {
			if(p.getAge() >= age) {
				p.printPerson(p);
			} else {
				System.out.println("No is OlderThan");
			}
		}
	}
	
}
