/**
 * 
 */
package com.smoothstack.jb.wk1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author dyltr
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader r1;
		String[] splitter;
		int[][] input = null;
		int numCase = 0;
		try {
			r1 = new BufferedReader(new FileReader("resources/wk1/input.txt"));
			numCase = Integer.parseInt(r1.readLine());
			input = new int[numCase][2];
			for(int i = 0; i<numCase; i++) {
				splitter = r1.readLine().split(" ");
				input[i][0] = Integer.parseInt(splitter[0]);
				input[i][1] = Integer.parseInt(splitter[1]);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		Lambdas m1 = new Lambdas();
		PerformOperation p1;
		
		try {
		for (int i = 0; i<numCase; i++) {
			switch(input[i][0]) {
			case 1:
				p1 = m1.isOdd();
				System.out.println((p1.operate(input[i][1]))?"ODD":"EVEN");
				break;
			case 2:
				p1 = m1.isPrime();
				System.out.println((p1.operate(input[i][1]))?"PRIME":"COMPOSITE");
				break;
			case 3:
				p1 = m1.isPalindrome();
				System.out.println((p1.operate(input[i][1]))?"PALINDROME":"NOT PALINDROME");
				break;
			default:
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

	/**
	 * @return true if number is odd
	 */
	public PerformOperation isOdd() {
		return (a) -> (a%2!=0);
	}
	
	/**
	 * @return true if number is prime
	 */
	public PerformOperation isPrime() {
		return (a) -> {
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
	
	/**
	 * @return true if number is palindrome
	 */
	public PerformOperation isPalindrome() {
		return (a) -> {
			String test = ""+a;
			for (int i = 0; i<test.length()/2; i++) {
				if(test.charAt(i)!=test.charAt(test.length()-1-i))
					return false;
			}
			return true;
		};
	}
}
