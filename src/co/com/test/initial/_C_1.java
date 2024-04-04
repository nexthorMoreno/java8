package co.com.test.initial;

public class _C_1 {
	private static int $;
	//private static String a_b; //works fine on the line 11

	public static void main(String[] args) {
		System.out.println($);
		//System.out.println(this.$);not use this in static context
		//not initialized, it must be accessed by an object reference or in a static context
		//System.out.println(a_b); 
	}
}