/**
 * 
 */
package tests.day5;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.smoothstack.jb.day5.MappingNumbers;

/**
 * @author dyltr
 *
 */
class MappingNumbersTest {


	@Test
	void appendingIntegersTest() {
		MappingNumbers m1 = new MappingNumbers();
		Integer[] test = {3,1,4};
		List<Integer> array = Arrays.asList(test);
		//test list of multiple elements
		assertEquals(m1.appendedIntegers(array), "o3,o1,e4");
		//test list of one
		test = new Integer[] {1};
		array = Arrays.asList(test);
		assertEquals(m1.appendedIntegers(array), "o1");
	}

}
