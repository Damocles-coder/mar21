/**
 * 
 */
package com.smoothstack.jb.day5;
import static org.hamcrest.CoreMatchers.containsString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
		//sarray = m1.sortArrayByLetterE(args);
		sarray = m1.staticHelper(args);
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
			if(s1.contains("e")) {
				//-1 comes before 1
				return -1;
			}
			return 1;
		});
		return sarray;
	}
	
	public String[] staticHelper(String[] sarray) {
		List<String> before = Arrays.asList(sarray);
		List<String> after = before.stream().filter((s)->{
			return (s.contains("e"));
				}).collect(Collectors.toList());
		List<String> after2 = before.stream().filter((s)->{
			return (!s.contains("e"));
				}).collect(Collectors.toList());
		after.addAll(after2);
		after.toArray(sarray);
		return sarray;
	}
}
