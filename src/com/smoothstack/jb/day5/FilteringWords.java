/**
 * 
 */
package com.smoothstack.jb.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dyltr
 *
 */
public class FilteringWords {

	/**
	 * @param args Array of words I will filter
	 */
	public static void main(String[] args) {
		FilteringWords m1 = new FilteringWords();
		List<String> before = Arrays.asList(args);
		List<String> after = m1.filterString(before);
		System.out.println(after.toString());
	}
	
	public List<String> filterString(List<String> array) {
		return array.parallelStream().filter((s) -> (s.charAt(0)=='a' && s.length()==3)).collect(Collectors.toList());
	}
}
