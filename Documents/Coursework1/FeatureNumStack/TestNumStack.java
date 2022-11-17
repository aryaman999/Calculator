package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestNumStack {
  NumStack stack;

  @Test
  @BeforeEach
  void testClass() {

    stack = new NumStack();


  }

  @Test
  void testSize() {

    assertEquals(stack.size(), 0, "Check if a newly created stack is empty");


  }
  
  @Test 
  void testPush() {
    stack.push(2.1f);
    assertEquals(stack.size(), 1, "Test to see if push increases size of stack");

    
  }



}


