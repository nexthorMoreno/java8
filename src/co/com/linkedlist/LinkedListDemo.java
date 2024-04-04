package co.com.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList<>();
    ll.add("A");
    ll.add("B");
    ll.add("C");
    ll.add("D");
    ll.add("E");
    ll.addLast("Y");
    ll.addFirst("Z");
    ll.add("1");
    System.out.println("Original: " + ll);

    ll.remove("A");
    ll.remove("2");
    System.out.println("After deletion: " + ll);

    ll.removeFirst();
    ll.removeLast();
    System.out.println("After deletion2: " + ll);

    Object val = ll.get(2);
    ll.set(2, (String) val + " Changed");
    System.out.println("All after changes: " + ll);
  }

}
