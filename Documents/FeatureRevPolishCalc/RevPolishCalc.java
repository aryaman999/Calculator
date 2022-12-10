package uk.ac.rhul.cs2800;

import java.text.DecimalFormat;
import java.util.EmptyStackException;

/**
 * The RevPolishCalc Class evaluates reverse polish string expressions.
 *
 * @author Aryaman Rawat
 */
public class RevPolishCalc implements Calculator {

  NumStack values;

  /**
   * A default constructor to initialise NumStack.
   */
  public RevPolishCalc() {
    values = new NumStack();
  }


  /**
   * Evaluates and returns answer to RPN(Reverse polish notation) expression passed to it. Some of
   * these codes are inspired from a web site which you can visit at
   * [https://www.programcreek.com/2012/12/leetcode-evaluate-reverse-polish-notation/].
   *
   * @param what is the expression which is to be calculated.
   * @return the evaluated value
   * @throws WrongExpression thrown if expression is not correct.
   */
  public float evaluate(String what) throws WrongExpression {

    String[] tokens = what.split(" ");

    for (String x : tokens) {

      if (isNumber(x)) {


        values.push(Float.parseFloat(x));

      } else if (x.equals("+") || x.equals("-") || x.equals("/") || x.equals("*")) {


        calculate(x, what);

      } else {


        throw new WrongExpression("Wrong expression\nGot: " + what);
      }
    }
    float tempVal = values.pop();

    if (!values.isEmpty()) {
      throw new WrongExpression("Too many operators\n: " + what);
    }

    if (Float.isInfinite(tempVal)) {
      throw new WrongExpression("Arithmetic overflow error\nNumber too big to solve");
    }

    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    tempVal = Float.parseFloat(decimalFormat.format(tempVal));
    // Used decimal format to round to 2 d.p.
    return tempVal;
    // returns tempVal gives a new float value which has been formatted.
  }

  private void calculate(String operator, String what) throws WrongExpression {
    // This method was inspired from the web site linked below some code was used to build this
    // method successfully.
    // Link:[https://www.programcreek.com/2012/12/leetcode-evaluate-reverse-polish-notation/]
    try {
      float left = values.pop();
      float right = values.pop();

      switch (operator) {
        case "+":
          values.push(left + right);
          break;

        case "-":
          values.push(right - left);
          break;

        case "*":
          values.push(left * right);

          break;

        default:
          if (left == 0f) {
            throw new WrongExpression("Trying to divide by zero\nGot: " + what);
          }

          values.push(right / left);
          break;
      }
    } catch (EmptyStackException e) {
      throw new WrongExpression("Too few operands\nGot: " + what);
    }
  }

  /**
   * Determines if the specified string is a number. Some of the code is inspired from the given web
   * site [https://www.baeldung.com/java-check-string-number]
   *
   * @param number the string to be checked
   * @return a boolean true if the string is a number or else it's false
   */
  public static boolean isNumber(String number) {

    if (number == null) {
      return false;
    }

    String[] array = number.split("");

    for (int i = 0; i < array.length; i++) {

      if (i == 0 && array.length > 1) {

        if (array[i].equals("+") || array[i].equals("-")) {
          continue;
        }
      } else {

        try {
          Float.parseFloat(array[i]);
        } catch (NumberFormatException e) {
          return false;
        }
      }

    }
    return true;
  }
}


