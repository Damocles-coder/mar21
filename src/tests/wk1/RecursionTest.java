/**
 * 
 */
package tests.wk1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.smoothstack.jb.wk1.Recursion;

/**
 * @author dyltr
 * test recursion class
 */
class RecursionTest {

	@Test
	void matchSumTest() {
		int[] array = {5,2,3,4};
		
		Recursion m1 = new Recursion();
		//expecting true
		assertEquals(m1.matchSum(array, 8), true);
		//expecting false
		assertEquals(m1.matchSum(array, 100), false);
		
		//edge case of 1 element
		array = new int[] {10};
		assertEquals(m1.matchSum(array, 10), true);
		//expecting false
		assertEquals(m1.matchSum(array, 100), false);
		
		//edge case of recurring elements
		array = new int[] {5,3,3,20};
		assertEquals(m1.matchSum(array, 26), true);
		//expecting false
		assertEquals(m1.matchSum(array, 8), false);
	}

}
