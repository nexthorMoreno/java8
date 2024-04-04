package co.com.generics.wildcard;

/**
 * During the type erasure process, the Java compiler erases all type parameters 
 * and replaces each with its first bound if the type parameter 
 * is bounded, or Object if the type parameter is unbounded.
 * @author nestor.moreno
 *
 */
public class TypeErasure<T> {

	private T data;
	private TypeErasure<T> next;
	
	public TypeErasure(T data, TypeErasure<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData(){
		return data;
	}
}

/**
 * Because the type parameter T is unbounded, the Java compiler replaces it with 
 * Object:
 * @author nestor.moreno
 *
 */
class TypeErasureUnbounded {
	private Object data;
	private TypeErasureUnbounded next;
	
	public TypeErasureUnbounded(Object data, TypeErasureUnbounded next) {
		this.data = data;
		this.next = next;
	}
	
	public Object getData() {
		return data;
	}
}

/**
 * Internally the compiler converts the bounded type parameter to the 
 * first bound class Comparable as show the BoundedTypeToComparable class
 * @author nestor.moreno
 *
 * @param <T>
 */
class TypeErasureBoundedTypeParam<T> {
	private T data;
	private TypeErasureBoundedTypeParam next;
	
	public TypeErasureBoundedTypeParam(T data, TypeErasureBoundedTypeParam next) {
		this.data = data;
		this.next = next;
	}
	
	public T getData() {
		return data;
	}
	
}

/**
 * The Java compiler replaces the bounded type parameter T with the first 
 * bound class, Comparable:
 * @author nestor.moreno
 *
 */
class BoundedTypeToComparable {
	
	private Comparable data;
	private BoundedTypeToComparable next;
	
	public BoundedTypeToComparable(Comparable data, BoundedTypeToComparable next) {
		this.data = data;
		this.next = next;
	}
	
	public Comparable getData() {
		return data;
	}
	
}

