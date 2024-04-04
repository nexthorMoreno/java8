package co.com.generics;

/**
 * Generic Methods introduced you to type inference, which enables you to invoke a generic method as
 * you would an ordinary method, without specifying a type between angle brackets
 *
 * @author nestormoreno
 *
 */
public class TypeInference2 {

  public static void main(String[] args) {
    java.util.ArrayList<Box<Integer>> listOfIntegerBoxes = new java.util.ArrayList<>();
    TypeInference2.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
    TypeInference2.addBox(Integer.valueOf(20), listOfIntegerBoxes);
    TypeInference2.addBox(Integer.valueOf(30), listOfIntegerBoxes);
    TypeInference2.outputBoxes(listOfIntegerBoxes);

  }

  public static <U> void addBox(U u, java.util.List<Box<U>> boxes) {
    Box<U> box = new Box<>();
    box.setT(u);
    boxes.add(box);
  }

  public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
    int counter = 0;
    for (Box<U> box : boxes) {
      U boxContents = box.get();
      System.out.println("Box # " + counter + " contains [" + boxContents.toString() + "]");
      counter++;
    }
  }

}
