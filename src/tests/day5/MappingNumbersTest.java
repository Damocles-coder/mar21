/**
 * 
 */
package tests.day5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.smoothstack.jb.day5.MappingNumbers;

/**
 * @author dyltr
 *
 */
class MappingNumbersTest {


	@Test
	void appendIntTest() {
		MappingNumbers m1 = new MappingNumbers();
		Integer[] test = {3,1,4,15,9,6,2,5,35,8,97,93,23,84,62,64,83};
		List<Integer> array = Arrays.asList(test);
		List<String> afterArray = array.parallelStream().map((i) -> m1.appendInt(i)).collect(Collectors.toList());
		//test first element
		assertEquals(afterArray.get(0), "o3");
		//middle even element
		assertEquals(afterArray.get(2), "e4");
		//middle odd element
		assertEquals(afterArray.get(7), "o5");
		//last element
		assertEquals(afterArray.get(afterArray.size()-1), "o83");
		//size matches original
		assertEquals(afterArray.size(),array.size());
	}

}
