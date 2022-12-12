package uk.ac.rhul.cs2800;

/**
 * A interface to provide methods to evaluate expressions for different types of calculators.
 *
 * @author Aryaman Rawat
 *
 */
public interface Calculator {

  /**
   * Evaluates the expression and returns answer to expression given by user.
   *
   * @param what - the expression to be evaluated
   * @return the answer to given expression
   * @throws WrongExpression if expression is not correct
   */
  public float evaluate(String what) throws WrongExpression;

}
