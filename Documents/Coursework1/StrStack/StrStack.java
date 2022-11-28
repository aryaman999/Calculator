package uk.ac.rhul.cs2800;

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
