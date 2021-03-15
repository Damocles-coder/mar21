/**
 * 
 */
package com.smoothstack.jb.wk1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author dyltr
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numCase = 0;
		String[] input;
		Lambdas m1 = new Lambdas();
		PerformOperation p1;
		
		try {
			numCase = Integer.parseInt(scanner.nextLine());
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
			scanner.close();
			System.exit(0);
		}
		try {
		for (int i = 0; i<numCase; i++) {
			input = scanner.nextLine().split(" ");
			switch(Integer.parseInt(input[0])) {
			case 1:
				p1 = m1.isOdd();
				System.out.print((p1.operate(Integer.parseInt(input[1])))?"Odd":"Even");
				break;
			case 2:
				p1 = m1.isPrime();
				System.out.print((p1.operate(Integer.parseInt(input[1])))?"Prime":"Composite");
				break;
			case 3:
				p1 = m1.isPalindrome();
				System.out.print((p1.operate(Integer.parseInt(input[1])))?"Palindrome":"Not Palindrome");
				break;
			default:
				System.out.println("Invalid Input");
				scanner.close();
				System.exit(0);
			}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
			scanner.close();
			System.exit(0);
		}
		scanner.close();

	}

	public PerformOperation isOdd() {
		return (int a) -> (a%2!=0);
	}
	
	/**
	 * @return true if number is prime
	 */
	public PerformOperation isPrime() {
		return (int a) -> {
			if (a==1)
				return false;
			if (a%2==0) {
				if (a==2) {
					return true;
				}
				return false;
			}
			for (int i=2; i*i<=a; i++) {
				if (a%i==0)
					return false;
			}
			return true;
		};
	}
	
	public PerformOperation isPalindrome() {
		return (int a) -> {
			String test = ""+a;
			for (int i = 0; i<test.length()/2; i++) {
				if(test.charAt(i)!=test.charAt(test.length()-1-i))
					return false;
			}
			return true;
		};
	}
}
