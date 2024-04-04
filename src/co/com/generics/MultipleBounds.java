package co.com.generics;

import co.com.generics.MultipleBounds.B;
import co.com.generics.MultipleBounds.C;

public class MultipleBounds {

  interface B {
  }

  interface C {
  }

}


class D<T extends MultipleBounds & B & C> {
  B a = (B) new MultipleBounds();

}
