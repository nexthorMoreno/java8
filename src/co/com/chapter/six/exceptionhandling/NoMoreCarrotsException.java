package co.com.chapter.six.exceptionhandling;

/**
 * Created by nestor.moreno on 2017-02-16.
 */
public class NoMoreCarrotsException extends Exception{
}

/**
 * NoMoreCarrotsException is an checked exception by this reason
 * the use of the eatCarrot method implies the declaration or the manage of the
 * exception using try catch or new
 */
public class Bunny {
    public static void main(String[] args) {
        eatCarrot();
    }

    private static void eatCarrot() throws NoMoreCarrotsException {}

    public void bad() {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) { // Does not compile
            System.out.print("Sad Rabbit");
        }
    }

    public void good() throws NoMoreCarrotsException {
        eatCarrot();
    }
}

/**
 * Remember: a subclass can not override methods that can return new checked exceptions
 * but if declare new methods, it can return checked exceptions
 * Remember: The subclass new methods can return their own exceptions if this are more specific
 */
class CanNotHopException extends Exception {}

class Hopper {
    public void hop() {}
}

class Bunny extends Hopper {
    public void hop() throws CanNotHopException {} //does not compile

    public void hop2() throws CanNotHopException {}
}