package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
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
    @SuppressWarnings("unused")
    Entry entry;
    for (int i = 0; i < 11; i++) {
      entry = new Entry("Testing" + i);
      stack.push(i); // testing to see if its possible to push multiple times
    }

    for (int i = 10; i > 0; i--) {
      stack.pop(); // testing to see if its possible to push multiple times

    }

  }



}


