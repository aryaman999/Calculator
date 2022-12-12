package uk.ac.rhul.cs2800;

import java.util.function.Consumer;

/**
 * Contains methods to implement and tell how to interact with the controller of the calculator
 * program.
 *
 * @author Aryaman Rawat
 *
 */
public interface ViewInterface {

  /**
   * Returns string given in expression.
   *
   * @return expression
   */
  public String getExpression();

  /**
   * Displays evaluated answer or error.
   *
   * @param str is the answer to be displayed to user.
   */
  public void setAnswer(String str);

  /**
   * Adds observer to calculate answer.
   *
   * @param f is the observer to be added
   */
  public void addCalcObserver(Observer f);

  /**
   * Adds observer to change action.
   *
   * @param l the observer to be added
   */
  public void addTypeObserver(Consumer<OpType> l);



}
