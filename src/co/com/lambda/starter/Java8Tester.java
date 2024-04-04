package co.com.lambda.starter;

public class Java8Tester {

  public static void main(String args[]) {
    Java8Tester tester = new Java8Tester();

    // with type declaration
    MathOperation addition = (int a, int b) -> a + b;

    // with out type declaration
    MathOperation substraction = (a, b) -> a - b;

    // with return statement along with curly braces
    MathOperation multiplication = (int a, int b) -> {
      return a * b;
    };

    // without return statement and without curly braces
    MathOperation division = (int a, int b) -> a / b;

    System.out.println("" + tester.operate(10, 5, addition));
    System.out.println("" + tester.operate(10, 5, substraction));
    System.out.println("" + tester.operate(10, 5, multiplication));
    System.out.println("" + tester.operate(10, 5, division));

    // With parenthesis
    GreetingService greetService1 = message -> System.out.println("Hello" + message);

    // without parenthesis
    GreetingService greetService2 = (message) -> System.out.println("Hello" + message);

    greetService1.sayMessage("Hello1");
    greetService2.sayMessage("Hello2");

  }

  private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);
  }
}
