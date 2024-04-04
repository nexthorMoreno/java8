package co.com.generics;

/**
 * This is a generic class followed by the class name, the <> is called type parameter section or
 * type variable This same technique can be applied to create generic interfaces.
 *
 * @author nestormoreno
 */
public class Box<T> {

  private T t;

  public void setT(T t) {
    this.t = t;
  }

  public T getT() {
    return t;
  }

  public static void main(String[] args) {
    Box<Integer> integerBox = new Box<>();
    Box<String> stringBox = new Box<>();

    integerBox.setT(10);
    stringBox.setT("Hello World");

    System.out.printf("Integer Value :%d\n\n", integerBox.getT());
    System.out.printf("String Value :%s\n", stringBox.getT());
  }

  public void add(Number integer) {
    // TODO Auto-generated method stub

  }

}


/**
 * This code can be proclivity to error by it's possible that in some parts of the code we expect an
 * Integer or a String
 **/
class Box2 {
  private Object object;

  public void set(Object object) {
    this.object = object;
  }

  public Object get() {
    return object;
  }

}
