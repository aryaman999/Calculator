package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestNumStack {
  NumStack stack;

  @Test
  @BeforeEach
  void testClass() {
    // Test 1
    stack = new NumStack();


  }

  @Test
  @BeforeEach
  void testSize() {
    // Test 2
    assertEquals(stack.size(), 0, "Check if a newly created stack is empty");


  }



}
