package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * The StrStack class contains strStack.
 *
 * @author zjac180
 *
 */
public class StrStack {
  private Stack strStack;

  /**
   * A default constructor creates empty strStack.
   *
   */
  public StrStack() {
    strStack = new Stack();
  }


  /**
   * Checks whether strStack is empty or not.
   *
   * @return true if strStack is empty and false if strStack is not empty.
   */
  public boolean isEmpty() {

    return strStack.isEmpty();
  }


  /**
   * Pushes value to the top of stack.
   *
   * @param string is the string pushed into top of strStack.
   */
  public void push(String string) {
    strStack.push(new Entry(string));

  }


  /**
   * Removes string at top of strStack and returns it.
   *
   * @return the string on top of strStack
   * @throws EmptyStackException if popped from a empty strStack.
   * 
   */
  public String pop() throws EmptyStackException {

    return strStack.pop().getString();
  }



}
