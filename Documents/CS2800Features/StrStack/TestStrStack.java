package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStrStack {
  StrStack stack;

  @Test
  @BeforeEach
  void testClass() {

    stack = new StrStack();


  }


  @Test
  void testIsEmpty() {

    assertEquals(stack.isEmpty(), true, "Check if a newly created stack is empty");


  }


  @Test
  void testPush() {
    stack.push("hello 234");
    assertFalse(stack.isEmpty(), "Test to see if stack with one element is not outputted as empty");


  }

  @Test
  void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> stack.pop(),
        "You cant pop from empty stack it should throw empty stack exception");


  }


  @Test
  void testPushthenPop() {
    stack.push("hello");
    assertEquals(stack.pop(), "hello",
        "pushing string into stack and popping it to get (hello) as return");
    assertThrows(EmptyStackException.class, () -> stack.pop(), "pop and pop should give exception");

  }



  @Test
  void testMultiplePushAndPop() {
    stack.push("hello");
    stack.push("5+5");
    stack.push("5*4");
    stack.push("exit");
    stack.pop();
    stack.pop();
    // Test to see if multiple push and pop works using TDD approach.

  }



}
