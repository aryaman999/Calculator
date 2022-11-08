package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Some of the code below was partially inspired by following the TDD demo video. 
class TestStack {
  private Stack stack;

  @Test
  @BeforeEach
  public void setup() {
    // Test 1
    stack = new Stack(); // created stack class
  }

  @Test
  void testSize() {
    // Test 2
    assertEquals(stack.size(), 0, "Test shows a newly created stack to see if it has size zero.");
    // created method size and faked return to pass test following TDD approach.
  }

  @Test
  void testPush() {
    // Test 3
    stack.push(new Entry("test"));
    assertEquals(stack.size(), 1, "Test to see if push increases size of stack");
    // created method push and added more code to size
  }

  @Test
  void testEmptyPop() {
    // Test 4
    assertThrows(EmptyStackException.class, () -> stack.pop(),
        "You cant pop from empty stack it should throw empty stack exception");
    // created method pop and added a throw statement
  }

  @Test
  void testPushthenPop() {
    // Test 5
    Entry entry = new Entry("test");
    stack.push(entry);
    assertEquals(stack.pop(), entry, "pushing five into stack and popping it to get five as return");
    assertThrows(EmptyStackException.class, () -> stack.pop(), "pop and pop should give exception");

  }


  @Test
  void testMultiplePush() {
    // Test 6


    for (int i = 0; i < 10; i++) {
      Entry entry = new Entry("testing" + i);
      stack.push(entry); // testing to see if its possible to push multiple times

    }

  }

  @Test
  void testMultiplePushAndPop() {
    // Test 7
    Entry entry;
    for (int i = 0; i < 11; i++) {
      entry = new Entry("Testing" + i);
      stack.push(entry); // testing to see if its possible to push multiple times
    }

    for (int i = 10; i > 0; i--) {
      stack.pop(); // testing to see if its possible to push multiple times

    }

  }


  @Test
  void emptyTop() {
    // Test 8
    assertThrows(EmptyStackException.class, () -> stack.top(),
        "Checking if top of empty stack throws a empty stack exception");
    // added if statement to check if size is zero and throw a empty stack exception
    // After continuing TDD cycle a better implementation was made to this test method


  }

  @Test
  void testTop() {
    // Test 9
    Entry first = new Entry("first entry");
    Entry second = new Entry("Second entry");
    stack.push(first);
    stack.push(second);
    assertEquals(stack.top(), second, "Test to see if top returns newest entry");
    // faked return to pass test following TDD approach
    // updated stack class to return newest entry
    // After repeating TDD cycle, I implemented entry to stack and created two entries
    // testTop() returns newest entry

  }



}
