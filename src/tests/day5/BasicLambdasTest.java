/**
 * 
 */
package tests.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.smoothstack.jb.day5.BasicLambdas;

/**
 * @author dyltr
 *
 */
class BasicLambdasTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void sortTest() {
		BasicLambdas m1 = new BasicLambdas();
		String[] test = { "This", "is", "a", "string", "ew" };
		test = m1.sortArrayByLength(test);
		assertEquals(test[0],"a");
		test = m1.sortArrayByReverseLength(test);
		assertEquals(test[0],"string");
		test = m1.sortArrayByFirstChar(test);
		assertEquals(test[0],"a");
		test = m1.sortArrayByLetterE(test);
		assertEquals(test[0],"ew");
	}

}
