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
public class MappingNumbers implements AppendNumbers {
	
	/**
	 * Accepting integers through command line arguments
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> array = new ArrayList<Integer>();
		for (String string : args) {
			try {
				array.add(Integer.parseInt(string));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		MappingNumbers m1 = new MappingNumbers();
		List<String> afterArray = array.stream().map((i) -> m1.appendInt(i)).collect(Collectors.toList());
		boolean first = true;
		for (String string : afterArray) {
			if (first) {
				first = false;
				System.out.print(string);
			}
			else
				System.out.print("," + string);
		}
	}

	@Override
	public String appendInt(int i) {
		return (i%2==0)?"e"+i:"o"+i;
	}

}
