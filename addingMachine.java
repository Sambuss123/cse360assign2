package cse360assign2;

public class addingMachine {

	private int total;
	private String input = "0";
	
	public void AddingMachine () {
		total = 0;  // not needed - included for clarity}
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		input += " + " + value;
	}
	
	public void subtract (int value) {
		total -= value;
		input += " - " + value;
	}
	
	public String toString () {
		return input;
	}
	
	public void clear() {
		total = 0;
	}
	
}
