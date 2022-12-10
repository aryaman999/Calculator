package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestRevPolishCalc {
  RevPolishCalc calculator;

  @Test
  @BeforeEach
  void testClass() {
    calculator = new RevPolishCalc(); // Creates RevPolishCalc class.

  }

  @Test
  void testSingle() throws WrongExpression {
    assertEquals(calculator.evaluate("2 4 +"), 6f,
        "test should give right answer as expression is valid");


  }

  @Test
  void testMultiple() throws WrongExpression {
    assertEquals(calculator.evaluate("2 4 +"), 6f,
        "test should give right answer as expression is valid");
    assertEquals(calculator.evaluate("6 4 -"), 2f,
        "test should give right answer as expression is valid");
    assertEquals(calculator.evaluate("2 4 *"), 8f,
        "test should give right answer as expression is valid");
    assertEquals(calculator.evaluate("6 2 /"), 3f,
        "test should give right answer as expression is valid");


  }
}
