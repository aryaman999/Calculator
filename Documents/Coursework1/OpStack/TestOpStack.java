package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

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



}


