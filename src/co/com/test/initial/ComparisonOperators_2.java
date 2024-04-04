package co.com.test.initial;

public class ComparisonOperators_2 {
	String s3;
	public static void main(String[] args) {
		ComparisonOperators_2 c = new ComparisonOperators_2();
		String s1 = "Java";
		String s2 = "Java";
		c.s3 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2); //true because the two Strings are literals
		System.out.println(s1 == c.s3); //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(sb1.toString() == s1); //false
		System.out.println(sb1.toString().equals(s1)); // true
		System.out.println(new String("Java") == s1);//false, new create a new instance of String and deletes any possible pointer equality
	}
}

/*General explanation
 * "==" compares the object locations in memory
 * "equals" compares the constent of the two objects
 */