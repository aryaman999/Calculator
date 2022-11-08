package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

/**
 * The Stack class which represents a stack of Entry objects.
 *
 * @author Aryaman Rawat
 */
public class Stack {

  private int size = 0;

  private List<Entry> list = new LinkedList<Entry>();
  // linked list was used over array because the program requires different type data elements

  /**
   * Returns current number of elements present in stack.
   *
   * @return number of elements in stack.
   */
  public int size() {
    return size;
  }

  /**
   * Pushes object to the top of stack.
   *
   * @param entry the object which will be pushed onto the top
   */
  public void push(Entry entry) {
    list.add(size, entry);
    size = size + 1;
  }

  /**
   * Removes top object stored in stack and returns it.
   *
   * @return the object at top of stack
   */
  public Entry pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    size = size - 1;
    return list.get(size);

  }

  /**
   * Returns top object in stack without being removed/popped.
   *
   * @return the top object at the top of stack
   */
  public Entry top() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    return list.get(size - 1);


  }


}
