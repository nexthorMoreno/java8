package co.com.generics;

public class TypeInferenceGenericAndNotGenerics<X> {

  public <T> TypeInferenceGenericAndNotGenerics(T t) {

  }

  public static void main(String[] args) {
    TypeInferenceGenericAndNotGenerics<Integer> myObj = new TypeInferenceGenericAndNotGenerics<>("");
    myObj.toString();
    TypeInferenceGenericAndNotGenerics obj = new TypeInferenceGenericAndNotGenerics<Integer>("");
    obj.toString();
  }

}
