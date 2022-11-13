package uk.ac.rhul.cs2800;

/**
 * A container class containing float,string or a symbol.
 *
 * @author zjac180
 */
public class Entry {

  private float number;
  private Symbol other;
  private String str;

  private Type type;

  /**
   * Creates entry for specified float value.
   *
   * @param value the float value is stored in this entry
   */
  public Entry(float value) {
    this.number = value;
    this.type = Type.NUMBER;

  }

  /**
   * Creates entry for specified symbol value.
   *
   * @param choose the symbol value to be stored in the entry
   */
  public Entry(Symbol choose) {
    this.other = choose;
    this.type = Type.SYMBOL;
  }

  /**
   * Creates entry for specified string value.
   *
   * @param string the string value to be stored in the entry
   */
  public Entry(String string) {
    this.str = string;
    this.type = Type.STRING;

  }

  /**
   * Returns float value stored in this entry.
   *
   * @return the float value stored in the entry
   */
  public float getValue() {
    return number;
  }

  /**
   * Returns string value contained in this entry.
   *
   * @return the string value stored in the entry
   */
  public String getString() {

    return str;
  }

  /**
   * Returns symbol value stored in this entry.
   *
   * @return the symbol value stored in this entry
   */
  public Symbol getSymbol() {

    return other;
  }

  /**
   * Return the type of value contained in this entry.
   *
   * @return the type of value stored in this entry
   */
  public Type getType() {
    return type;
  }

}
