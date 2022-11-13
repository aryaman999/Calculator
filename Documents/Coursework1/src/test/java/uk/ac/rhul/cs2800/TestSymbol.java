package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Some of the code below was partially inspired by the coding session during labs.

class TestSymbol {
  Symbol symbolLeftBracket;
  Symbol symbolRightBracket;
  Symbol symbolTimes;
  Symbol symbolDivide;
  Symbol symbolPlus;
  Symbol symbolMinus;
  Symbol symbolInvalid;

  @Test
  @BeforeEach
  void testEnum() {
    // Test 1

    symbolLeftBracket = Symbol.LEFTBRACKET;
    symbolRightBracket = Symbol.RIGHTBRACKET;
    symbolTimes = Symbol.TIMES;
    symbolDivide = Symbol.DIVIDE;
    symbolPlus = Symbol.PLUS;
    symbolMinus = Symbol.MINUS;
    symbolInvalid = Symbol.INVALID;
    // created enumeration for Symbol to make the test pass using TDD approach
  }

  void testtoString() {
    // Test 2
    assertEquals(symbolLeftBracket.toString(), "leftbracket : symbol : (",
        "test to see if tostring prints description");
    assertEquals(symbolRightBracket.toString(), "rightbracket : symbol : )",
        "test to see if tostring prints description");
    assertEquals(symbolTimes.toString(), "TIMES : symbol : * ",
        "test to see if tostring prints description");
    assertEquals(symbolDivide.toString(), "DIVIDE : symbol : / ",
        "test to see if tostring prints description");
    assertEquals(symbolPlus.toString(), "PLUS : symbol : + ",
        "test to see if tostring prints description");
    assertEquals(symbolMinus.toString(), "MINUS : symbol : - ",
        "test to see if tostring prints description");
    assertEquals(symbolInvalid.toString(), "INVALID : symbol : # ",
        "test to see if tostring prints description");

    // toString method added to return name(), the specific token and description

    // constructor was added to initialise token and description

    // messages were added to the values of enumeration to pass the test following TDD approach

  }
}
