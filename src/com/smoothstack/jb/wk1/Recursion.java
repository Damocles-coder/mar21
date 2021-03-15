package com.smoothstack.jb.wk1;

import java.util.ArrayList;
import java.util.Collections;

public class Recursion {
	public static void main(String[] args) {
		int[] array = new int[args.length];
		for (int i = 0; i<args.length; i++) {
			try {
				array[i]=Integer.parseInt(args[i]);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		Recursion m1 = new Recursion();
		System.out.print(m1.matchSum(array, 8));
		
	}
	
	public boolean matchSum(int[] array, int sum) {
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
			if(recursiveSum(trueGroup, sum, i)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean recursiveSum(ArrayList<Integer> array, int sum, int index) {
		sum -= array.get(index);
		boolean match = false;
		if (sum<0) {
			return false;
		}
		else if (sum==0) {
			return true;
		}
		else {
			// Given 1,2,3,4 with sum 8
			/* Once inside recursion with 2, it will add 3 than add 4 then return false
			 * It will backtrack to 1 then add 3 than 4 which will return true
			 */
			
			for (int i=index+1; i<array.size(); i++) {
				if (recursiveSum(array,sum,i)) {
					match = true;
					break;
				}
			}
		}
		
		return match;
	}
}
