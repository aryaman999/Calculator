package uk.ac.rhul.cs2800;

/**
 * An enumeration of the types of value an Entry can represent.
 *
 * @author Aryaman Rawat
 */
public enum Type {
  NUMBER("number value:", "N"),

  SYMBOL("symbol value:", "$"),

  STRING("string value:", "str"),

  INVALID("Invalid value:", "#");

  
  String value;
  String description;

  private Type(String value, String description) {
    this.value = value;
    this.description = description;
  }

  /**
   * Returns description about specific type of value from enumeration.
   */
  @Override
  public String toString() {
    return name() + ":" + description + "(" + value + ")";
  }
}
