/**
 * 
 */
package com.smoothstack.jb.day2;

/**
 * @author dyltr
 * Takes command line arguments, parses them, and adds them
 */
public class AddingWithExceptions {
	
	/**
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double sum = 0.0;
		for (String input:args) {
			try {
				sum += Double.parseDouble(input);
			}
			catch (Exception e) {
				System.out.println(input + " cannot be parsed into a double.");
				continue;
			}
		}
		System.out.print(sum);
	}

}
