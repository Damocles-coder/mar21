/**
 * 
 */
package com.smoothstack.jb.day2;

/**
 * @author dyltr
 *
 */
public class AddingWithExceptions {
	
	/**
	 * Takes command line arguments and adds them
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddingWithExceptions a1 = new AddingWithExceptions();
		Double sum = 0.0;
		for (String input:args) {
			try {
				sum += Double.parseDouble(input);
			}
			catch (Exception e) {
				System.out.println(input + " is not a valid number.");
				continue;
			}
		}
		System.out.print(sum);
	}

}
