package cse360assignment02;

/**Description: The AddingMachine class is capable of adding and subtracting numbers from the total, which is initialized as 0.
 * Using the toString() method will show all recent transactions made after initialization or the clear() method is used.
 * GitHub Link: https://github.com/connererickson/cse360assignment02.git
 * @author Conner Erickson
 * @version 1.0
 *
 */

public class AddingMachine {
  private int total;
  private String transactions = "";
  
  public AddingMachine () {
    total = 0;	// not needed - included for clarity
    transactions += total;
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  transactions += " + " + value;
  }

  public void subtract (int value) {
	  total -= value;
	  transactions += " - " + value;
  }

  public String toString () {
    return transactions;
  }

  public void clear() {
	  total = 0;
	  transactions = "";
  }
}