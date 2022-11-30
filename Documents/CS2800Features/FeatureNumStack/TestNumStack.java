package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Tests have been implemented from stack class
class TestNumStack {
  NumStack stack;

  @Test
  @BeforeEach
  void testClass() {

    stack = new NumStack();


  }

  @Test
  void testIsEmpty() {

    assertEquals(stack.isEmpty(), true, "Check if a newly created stack is empty");


  }

  @Test
  void testPush() {
    stack.push(2.1f);
    assertFalse(stack.isEmpty(), "Test to see if stack with one element is not outputted as empty");


  }

  @Test
  void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> stack.pop(),
        "You cant pop from empty stack it should throw empty stack exception");


  }

  @Test
  void testPushthenPop() {
    stack.push(4.5f);
    assertEquals(stack.pop(), 4.5f, "pushing five into stack and popping it to get five as return");
    assertThrows(EmptyStackException.class, () -> stack.pop(), "pop and pop should give exception");

  }

  @Test
  void testMultiplePushAndPop() {
    for (float i = 0; i < 11; i++) {
      stack.push(i); // testing to see if its possible to push multiple times
    }

    for (float i = 10; i >= 0; i--) {
      assertEquals(stack.pop(), i, "test to see if elements pushed are stored properly in stack");
    }
    assertTrue(stack.isEmpty());



  }



}


