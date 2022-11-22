package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * The OpStack class contains a opStack.
 *
 * @author Aryaman Rawat
 *
 */
public class OpStack {


  private Stack opStack;

  /**
   * A default constructor creates an empty opStack.
   */
  public OpStack() {
    opStack = new Stack();
  }

  public boolean isEmpty() {

    return opStack.isEmpty();
  }


  /**
   * Pushes symbol to the top of stack.
   *
   * @param object is used to push symbol type such as ADD,SUBTRACT,TIMES,DIVIDE into top of
   *        opStack.
   */
  public void push(Symbol object) {
    opStack.push(new Entry(object));

  }
  
}
