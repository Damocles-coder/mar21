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
		String[] sarray;
		BasicLambdas m1 = new BasicLambdas();
		//sarray = m1.sortArrayByLength(args);
		//sarray = m1.sortArrayByReverseLength(args);
		//sarray = m1.sortArrayByFirstChar(args);
		sarray = m1.sortArrayByLetterE(args);
		//sarray = Arrays.sort(args, (s1,s2)->staticHelper(s1,s2));
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
	
	public static String[] staticHelper(String s1, String s2) {
//		String[] sarray = (s1,s2) -> {
//			if(s1.charAt(0)=='e') {
//				//-1 comes before 1
//				return -1;
//			}
//			return 1;
//		});
		return null;
	}
}
