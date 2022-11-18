package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * The NumStack class contains a numStack.
 *
 * @author Aryaman Rawat
 */
public class NumStack {

  private int size = 0;

  private Stack numStack;

  /**
   * A default constructor creates an empty numStack.
   */
  public NumStack() {
    numStack = new Stack();
  }


  /**
   * Check if numStack is empty.
   *
   * @return size which has a initial size of 0.
   */
  public int size() {
    return size;
  }


  /**
   * A getter method to get numStack.
   *
   * @return numStack
   */
  public Stack getNumStack() {
    return numStack;
  }


  /**
   * A setter method to set or update value.
   */
  public void setNumStack(Stack numStack) {
    this.numStack = numStack;
  }



  /**
   * Pushes value to the top of stack.
   *
   * @param value is the number pushed into top of numStack.
   */
  public void push(float value) {
    numStack.push(new Entry(value));
    size = size + 1;



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

