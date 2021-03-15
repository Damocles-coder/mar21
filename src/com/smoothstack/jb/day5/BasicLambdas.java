/**
 * 
 */
package com.smoothstack.jb.day5;
import java.util.Arrays;

/**
 * @author dyltr
 *
 */
public class BasicLambdas {
	
	//TBD
	public static String[] staticHelper() {
		String[] array = null;
		return array;
	}
	
	public static void main(String[] args) {
		String[] sarray = {"This","is","a","string","array","everything","is","Awesome"};
		BasicLambdas m1 = new BasicLambdas();
		//sarray = m1.sortArrayByLength(sarray);
		//sarray = m1.sortArrayByReverseLength(sarray);
		//sarray = m1.sortArrayByFirstChar(sarray);
		sarray = m1.sortArrayByLetterE(sarray);
		//sarray = Arrays.sort(sarray, (s1,s2)->staticHelper());
		for (String string : sarray) {
			System.out.println(string);
		}
	}

	public String[] sortArrayByLength(String[] sarray) {
		Arrays.sort(sarray, (s1, s2)->(s1.length() - s2.length()));
		return sarray;
	}
	
	public String[] sortArrayByReverseLength(String[] sarray) {
		Arrays.sort(sarray, (s1, s2)->(s2.length() - s1.length()));
		return sarray;
	}
	
	public String[] sortArrayByFirstChar(String[] sarray) {
		Arrays.sort(sarray, (s1, s2)->(s1.toLowerCase().charAt(0) - s2.toLowerCase().charAt(0)));
		return sarray;
	}
	
	public String[] sortArrayByLetterE(String[] sarray) {
		Arrays.sort(sarray, (s1, s2)->{
			if(s1.charAt(0)=='e') {
				//-1 comes before 1
				return -1;
			}
			return 1;
		});
		return sarray;
	}
}
