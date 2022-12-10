package uk.ac.rhul.cs2800;

/**
 * Custom exception created to indicate if the expression is invalid.
 *
 * @author Aryaman Rawat
 *
 */
@SuppressWarnings("serial")
public class WrongExpression extends Exception {

  /**
   * Constructs the exception with given message.
   *
   * @param message error for the exception.
   */
  public WrongExpression(String message) {
    super(message);
  }

  /**
   * Constructs WrongExpression with no message.
   */
  public WrongExpression() {


  }



}
