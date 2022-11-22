package uk.ac.rhul.cs2800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOpStack {
  OpStack stack;

  @Test
  @BeforeEach
  void testClass() {
    // creating a new stack to pass test using TDD cycle
    stack = new OpStack();
    
  @Test
  void testIsEmpty() {

    assertEquals(stack.isEmpty(), true, "Check if a newly created stack is empty");


  }


  }
}
