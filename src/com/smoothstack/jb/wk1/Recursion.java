package com.smoothstack.jb.wk1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int[] array = new int[args.length];
		for (int i = 0; i<args.length; i++) {
			try {
				array[i]=Integer.parseInt(args[i]);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		try {
			sum = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			scanner.close();
			System.exit(0);
		}
		Recursion m1 = new Recursion();
		System.out.print(m1.groupSumClump(0, array, sum));
		scanner.close();
	}
	
	/**
	 * @param total added this upon further inspection of assignment (not needed as you can just decrement sum
	 * @param array
	 * @param sum
	 * @return
	 */
	public boolean groupSumClump(int total, int[] array, int sum) {
		//Start at index 0
		ArrayList<Integer> trueGroup = new ArrayList<Integer>();
		int temp = 0;
		//Allows grouping of adjacent values with the same value
		for(int i = 0;i<array.length;i++) {
			//In case you reach the last, this prevent out of bounds exception
			if (i==array.length-1) {
				trueGroup.add(array[i]);
			}
			else if(array[i]!=array[i+1]) {
				trueGroup.add(array[i]);
				//In case you reach the last 2, this prevent out of bounds exception
			}
			else {
				//group adjacent repeating integers
				while(array[i]==array[i+1]) {
					temp+=array[i];
					i++;	
				}
				temp+=array[i];
				trueGroup.add(temp);
				temp = 0;
			}
		}
		//sorts for easy addition
		Collections.sort(trueGroup);
		for(int i = 0; i<trueGroup.size(); i++) {
			if(recursiveSum(total, trueGroup, sum, i)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean recursiveSum(int total, ArrayList<Integer> array, int sum, int index) {
		total += array.get(index);
		boolean match = false;
		if (sum<total) {
			return false;
		}
		else if (sum==total) {
			return true;
		}
		else {
			// Given 1,2,3,4 with sum 8
			/* Once inside recursion with 2, it will add 3 than add 4 then return false
			 * It will backtrack to 1 then add 3 than 4 which will return true
			 */
			
			for (int i=index+1; i<array.size(); i++) {
				if (recursiveSum(total,array,sum,i)) {
					match = true;
					break;
				}
			}
		}
		
		return match;
	}
}