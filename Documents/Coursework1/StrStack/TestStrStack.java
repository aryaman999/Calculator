package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
}
