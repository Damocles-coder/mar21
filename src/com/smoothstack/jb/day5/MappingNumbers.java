/**
 * 
 */
package com.smoothstack.jb.day5;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dyltr
 *
 */
public class MappingNumbers {
	
	/**
	 * Accepting integers through command line arguments
	 * @param args
	 */
	public static void main(String[] args) {
		MappingNumbers m1 = new MappingNumbers();
		List<Integer> array = new ArrayList<Integer>();
		for (String string : args) {
			try {
				array.add(Integer.parseInt(string));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(m1.appendedIntegers(array));
	}
	
	public String appendedIntegers(List<Integer> list) {
		StringBuilder result = new StringBuilder("");
		List<String> after = list.stream().map((i) -> {
			return (i%2==0)?"e"+i:"o"+i;
		}).collect(Collectors.toList());
		result.append(after.get(0));
		for (int i = 1; i<after.size(); i++) {
			result.append("," + after.get(i));
		}
		return result.toString();
	}
}
