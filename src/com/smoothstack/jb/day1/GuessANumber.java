/**
 * 
 */
package com.smoothstack.jb.day1;
import java.lang.Math;
import java.util.*;

/**
 * @author dyltr
 * User will guess a number from 1-100 and will be given 5 chances to get within 10 of that number
 */
public class GuessANumber {
	
	/**
	 * Main function
	 * @param args none required
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		GuessANumber g1 = new GuessANumber();
		boolean withinRange = false;
		int selection;
		int randomNumber = g1.selectWithinRange(100);
		for (int i = 0; i<5; i++) {
			System.out.print("Pick a number from 1-100: ");
			try {
				selection = scanner.nextInt();
			}
			catch (InputMismatchException e) {
				e.printStackTrace();
				continue;
			}
			if (Math.abs(selection-randomNumber)<=10) {
				withinRange = true;
				break;
			}
			else {
				if (i<4) {
					System.out.println("Keep Trying");
				}
			}
		}
		System.out.println((withinRange)?"Close Enough,":"The answer was " + randomNumber);
		System.out.println("The answer was " + randomNumber);
	}
	
	/**
	 * @param range
	 * @return random number within range
	 */
	public int selectWithinRange(int range) {
		return (int)(Math.random()*range+1);
	}

}
