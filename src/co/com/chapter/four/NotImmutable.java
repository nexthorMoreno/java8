package co.com.chapter.four;

public class NotImmutable {
	private StringBuilder builder;
	
	public NotImmutable(StringBuilder b) {
		builder = b;
	}
	
	public StringBuilder getBuilder() {
		return builder;
		
	}
	
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("initial"); 
		NotImmutable problem = new NotImmutable(sb); 
		sb.append(" added");
		
		StringBuilder gotBuilder = problem.getBuilder(); 
		gotBuilder.append(" more"); 
		System.out.println(problem.getBuilder());
	}
	
	/*
	public Mutable(StringBuilder b) { 
		builder = new StringBuilder(b);
	}
	
	public StringBuilder getBuilder() {
	return new StringBuilder(builder); }
	*/
}
