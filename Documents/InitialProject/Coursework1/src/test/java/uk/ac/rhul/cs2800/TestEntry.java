package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEntry {

  private Entry entryNumber;
  private Entry entrySymbol;
  private Entry entryString;


  @Test
  @BeforeEach
  void testEntries() {
    // Test 1

    entryNumber = new Entry(1.5f);
    entrySymbol = new Entry(Symbol.TIMES);
    entryString = new Entry("hello");
    // created entry class and constructors for the three entries using TDD approach to pass test
  }

  @Test
  void testGetNumber() {
    // Test 2
    assertEquals(entryNumber.getValue(), 1.5f,
        "Test checks if value is similar to what it was set in constructor.");
    // Created getter method for Number entry

  }

  @Test
  void testGetSymbol() {
    // Test 3
    assertEquals(entrySymbol.getSymbol(), Symbol.TIMES,
        "Test checks if value is similar to what it was set in constructor.");

    // Created getter method for Symbol entry
  }

  @Test
  void testGetString() {
    // Test 4
    assertEquals(entryString.getString(), "hello",
        "Test checks if value is similar to what it was set in constructor.");
    // Created getter method for String entry

  }


  @Test
  void testGetType() {
    // Test 5
    assertEquals(entryNumber.getType(), Type.NUMBER, "Test to see if float type is number");
    assertEquals(entrySymbol.getType(), Type.SYMBOL, "Test to see if symbol type is a symbol");
    assertEquals(entryString.getType(), Type.STRING, "Test to see if string type is a string");

    // To pass the test correct code was added following TDD approach



  }



}
