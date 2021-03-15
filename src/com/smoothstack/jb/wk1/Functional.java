package com.smoothstack.jb.wk1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Functional {
	
	/**
	 * @param array
	 * @return array of right-most integers
	 */
	public Integer[] rightMostDigit(Integer[] array) {
		List<Integer> a = Arrays.asList(array);
		List<Integer> a2 = a.parallelStream().map((i)->{
			return Math.abs(i)%10;
		}).collect(Collectors.toList());
		a2.toArray(array);
		return array;
	}
	
	/**
	 * @param array
	 * @return array with values multiplied by 2 
	 */
	public Integer[] multByTwo(Integer[] array) {
		List<Integer> a = Arrays.asList(array);
		List<Integer> a2 = a.parallelStream().map((i)->{
			return i*2;
		}).collect(Collectors.toList());
		a2.toArray(array);
		return array;
	}

	/**
	 * @param array
	 * @return String array with no x
	 */
	public String[] removeX(String[] array) {
		List<String> a = Arrays.asList(array);
		List<String> a2 = a.stream().map((i)->{
			return i.replace("x", "");
		}).collect(Collectors.toList());
		a2.toArray(array);
		return (array);
	}
	
}
