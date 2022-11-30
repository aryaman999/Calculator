package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// All the required imports were successfully implemented

// Some of the code below was partially inspired by the coding session during labs.

class TestType {
  Type typeNumber;
  Type typeSymbol;
  Type typeString;
  Type typeInvalid;

  @Test
  @BeforeEach
  void testEnum() {
    // Test 1

    typeNumber = Type.NUMBER;
    typeSymbol = Type.SYMBOL;
    typeString = Type.STRING;
    typeInvalid = Type.INVALID;
    // created enumeration for Symbol to make the test pass using TDD approach
  }

  void testtoString() {
    // Test 2
    assertEquals(typeNumber.toString(), "Number value: N",
        "test to see if tostring prints description");
    assertEquals(typeSymbol.toString(), "symbol value: $",
        "test to see if tostring prints description");
    assertEquals(typeString.toString(), "string value: str ",
        "test to see if tostring prints description");
    assertEquals(typeInvalid.toString(), "Invalid value: # ",
        "test to see if tostring prints description");

    // toString method added to return name(), the specific token and description

    // constructor was added to initialise token and description

    // messages were added to the values of enumeration to pass the test following TDD approach

  }
}
