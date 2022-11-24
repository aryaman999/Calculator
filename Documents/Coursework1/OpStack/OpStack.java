package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * The OpStack class contains a stack of Symbol type Entry Objects such as TIMES,DIVIDE,PLUS,MINUS.
 *
 * @author Aryaman Rawat
 *
 */
public class OpStack {


  private Stack opStack;

  /**
   * A default constructor creates an empty opStack.
   */
  public OpStack() {
    opStack = new Stack();
  }

  public boolean isEmpty() {

    return opStack.isEmpty();
  }


  /**
   * Pushes symbol to the top of stack.
   *
   * @param symbol is used to push on top of the stack.
   * 
   */
  public void push(Symbol symbol) {
    opStack.push(new Entry(symbol));

  }


  /**
   * Removes the symbol at top of Stack and returns it.
   *
   * @return the Symbol on top of numStack
   * @throws EmptyStackException if popped from a empty Stack.
   * 
   */
  public Symbol pop() throws EmptyStackException {

    return opStack.pop().getSymbol();
  }



}

