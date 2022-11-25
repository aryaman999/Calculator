package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOpStack {
  OpStack stack;

  @Test
  @BeforeEach
  void testClass() {
    // creating a new stack to pass test using TDD cycle
    stack = new OpStack();
  }


  @Test
  void testIsEmpty() {

    assertEquals(stack.isEmpty(), true, "Check if a newly created stack is empty");


  }

  @Test
  void testPush() {
    stack.push(Symbol.TIMES);
    assertFalse(stack.isEmpty(), "Test to see if stack with one element is not outputted as empty");

  }

  @Test
  void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> stack.pop(),
        "You cant pop from empty stack it should throw empty stack exception");

  }

  @Test
  void testPushthenPop() {
    stack.push(Symbol.PLUS);
    assertEquals(stack.pop(), Symbol.PLUS, "test to see if popping gives same pushed operator");
    assertThrows(EmptyStackException.class, () -> stack.pop(), "pop and pop should give exception");

  }

  @Test
  void testMultiplePushAndPop() {

    Symbol[] values = Symbol.values();
    for (Symbol i : values) {
      stack.push(i);
    }
    for (int i = values.length - 1; i >= 0; i--) {
      assertEquals(stack.pop(), values[i],
          "test to see if elements pushed are stored properly in stack");
    }
    assertTrue(stack.isEmpty(),
        "test to show isEmpty() method works properly after mulitple push and pops");



  }

  @Test
  void testTop() {
    stack.push(Symbol.PLUS);
    stack.push(Symbol.DIVIDE);

    assertEquals(stack.top(), Symbol.DIVIDE, "Test to see if top returns newest entry");
    assertEquals(stack.pop(), Symbol.DIVIDE, "Test to see if top returns newest entry");
    assertEquals(stack.pop(), Symbol.PLUS, "Test to see if top returns newest entry");


    // Used TDD approach to get this test case working as expected
    // testTop() returns newest entry

  }
}

