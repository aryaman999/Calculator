package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * The NumStack class contains a numStack.
 *
 * @author Aryaman Rawat
 */
public class NumStack {

  private Stack numStack;

  /**
   * A default constructor creates an empty numStack.
   */
  public NumStack() {
    numStack = new Stack();
  }


  /**
   * Checks whether numStack is empty or not.
   *
   * @return true if numStack is empty and false if numStack is not empty.
   */
  public boolean isEmpty() {

    return numStack.isEmpty();
  }


  /**
   * Pushes value to the top of stack.
   *
   * @param value is the number pushed into top of numStack.
   */
  public void push(float value) {
    numStack.push(new Entry(value));

  }


  /**
   * Removes number at top of numStack and returns it.
   *
   * @return the number on top of numStack
   * @throws EmptyStackException if popped from a empty numStack.
   * 
   */
  public float pop() throws EmptyStackException {

    return numStack.pop().getValue();
  }



}

