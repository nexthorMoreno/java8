package co.com.lambda.anonymousclass;

/**
 * Anonymous class enables the possibility for create and instantiate a class at the same time. Make
 * your code more concise. Are like a local class, but without name. Can be used only one time. Are
 * expressions. It is not possible declare static initializers in an anonymous class 
 * It is not possible declare constructor in an anonymous class
 *
 * @author nestormoreno
 *
 */

public class HelloWorldAnonymousClasses {

  interface HelloWorld {
    public void greet();

    public void greetSomeone(String someone);
  }

  public void sayHello() {

    class EnglishGreeting implements HelloWorld {
      String name = "world";

      @Override
      public void greet() {
        greetSomeone("world");
      }

      @Override
      public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hello " + name);
      }
    }

    // uses local class for initialization of englishGreeting variable
    HelloWorld englishGreeting = new EnglishGreeting();

    // uses anonymous class for initialization of frenchGreeting variable
    HelloWorld frenchGreeting = new HelloWorld() {
      String name = "tout le monde";

      @Override
      public void greet() {
        greetSomeone("tout le monde");
      }

      @Override
      public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Salut " + name);
      }
    };

    // uses anonymous class for initialization of spanishGreeting variable
    HelloWorld spanishGreeting = new HelloWorld() {
      String name = "mundo";

      @Override
      public void greet() {
        greetSomeone("mundo");
      }

      @Override
      public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hola, " + name);
      }
    };
    englishGreeting.greet();
    frenchGreeting.greetSomeone("Fred");
    spanishGreeting.greet();
  }

  public static void main(String... args) {
    HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
    myApp.sayHello();
  }
}
