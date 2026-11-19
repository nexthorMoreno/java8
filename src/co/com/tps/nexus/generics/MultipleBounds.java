package co.com.tps.nexus.generics;

import co.com.tps.nexus.generics.MultipleBounds.B;
import co.com.tps.nexus.generics.MultipleBounds.C;

public class MultipleBounds {

  interface B {
  }

  interface C {
  }

}


class D<T extends MultipleBounds & B & C> {
  B a = (B) new MultipleBounds();

}
