package uk.ac.rhul.cs2800;

/**
 * A enumeration of non number tokens possible in a expression.
 *
 * @author Aryaman Rawat
 *
 */
public enum Symbol {
  LEFTBRACKET("Left bracket symbol:", "("), RIGHTBRACKET("Right bracket symbol:", ")"), TIMES(
      "Multiplication symbol:", "*"), DIVIDE("Divison symbol:", "/"), PLUS("Addition symbol:",
          "+"), MINUS("Subtraction symbol:", "-"), INVALID("Invalid symbol:", "#");


  String token;
  String description;

  private Symbol(String token, String description) {
    this.token = token;
    this.description = description;
  }

  /**
   * Returns description about specific token from the enumeration.
   */
  @Override
  public String toString() {
    return name() + ":" + description + "(" + token + ")";


  }



}
