package cse360assignment02;

public class AddingMachine {
	/**
	 * total variable
	 */
	 private int total;
	 private String track = "0";
	  
	 /**
	  * adding method that sets total
	  */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  /**
	   * getter or the total
	   * @return a zero
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * add function
	   * @param value
	   */
	  public void add (int value) {
		  total += value;
		  track += " + " + value;
	  }

	  /**
	   * subtract function
	   * @param value
	   */
	  public void subtract (int value) {
		  total = total - value;
		  track += " - " + value;
	  }

	  /**
	   * string function
	   * @return empty string
	   */
	  public String toString () {
	    return track;
	  }

	  /**
	   * clear function
	   */
	  public void clear() {
		  total = 0;
		  track = "";
	  }

}
