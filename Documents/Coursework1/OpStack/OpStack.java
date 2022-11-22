package uk.ac.rhul.cs2800;

/**
 * The NumStack class contains a numStack.
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
  

}
