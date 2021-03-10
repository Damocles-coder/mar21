/**
 * 
 */
package com.smoothstack.jb.day2;

import java.util.Arrays;

/**
 * @author dyltr
 *
 */
public class MaxOf2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxOf2DArray m1 = new MaxOf2DArray();
		Integer[][] twoDArray = {{1,2,3,4,5,6,7,8,9,0},{10,11,12,13,14,15,16,17,19,18}};
		System.out.println(Arrays.toString(m1.findMax(twoDArray)));
	}
	
	private Integer[] findMax(Integer[][] twoDArray) {
		if (twoDArray[0][0] == null) {
			return null;
		}
		Integer x = 0;
		Integer y = 0;
		Integer max = twoDArray[0][0];
		for (int i = 0; i<twoDArray.length; i++) {
			for (int j = 0; j<twoDArray[i].length; j++) {
				if (max < twoDArray[i][j]) {
					max = twoDArray[i][j];
					x = i;
					y = j;
				}
			}
		}
		return new Integer[] {max, x, y};
	}

}
