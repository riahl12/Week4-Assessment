/**
 *@author Riley Ahlrichs riahl12 - rpahlrichs
 *CIS175 - Spring 2023
 *Feb 7, 2023
 */
package model;


public class TwoNumbers {
	private int number1;
	private int number2;
	private int finalNum;
	

	public TwoNumbers() {
		super();
	}
	
	public TwoNumbers(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		addNumbers(number1, number2);
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public int getFinalNum() {
		return finalNum;
	}

	public void setFinalNum(int finalNum) {
		this.finalNum = finalNum;
		addNumbers(number1, number2);
	}
	
	public int addNumbers(int number1, int number2) {
		int finalNum;
		finalNum = number1 + number2;
		return finalNum;
	}
	
	@Override
	public String toString() {
		return "Result = " + (addNumbers(number1, number2)) + "";
	}
}
