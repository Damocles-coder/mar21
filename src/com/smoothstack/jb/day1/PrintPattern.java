/**
 * 
 */
package com.smoothstack.jb.day1;

/**
 * @author dyltr
 *
 */
public class PrintPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPattern p = new PrintPattern();
		
		//left-bottom heavy pyramid
		System.out.println("1)");
		for (int i = 1; i<=4; i++) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		p.lineBreakGenerator(9);
		System.out.println("");
		
		//left-top heavy pyramid
		System.out.println("2)");
		p.lineBreakGenerator(10);
		for (int i = 4; i>=1; i--) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		
		//center-bottom heavy pyramid
		System.out.println("3)");
		for (int i = 4; i>=1; i--) {
			for (int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k = 1 + 2*(4-i); k>0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		p.lineBreakGenerator(11);
		System.out.println("");
		
		//center-top heavy pyramid
		System.out.println("4)");
		p.lineBreakGenerator(12);
		for (int i = 1; i<=4; i++) {
			for (int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k = 7 - 2*(i-1); k>0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
	/**
	 * @param length of the line break
	 */
	public void lineBreakGenerator(int length) {
		for (int j = 0; j<length; j++) {
			System.out.print("-");
		}
		System.out.println("");
	}

}
