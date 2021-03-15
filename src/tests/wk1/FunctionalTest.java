package tests.wk1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.smoothstack.jb.wk1.Functional;

class FunctionalTest {

	@Test
	void rightMostDigitTest() {
		Functional m1 = new Functional();
		
		//testing single value
		Integer[] array = { 2 };
		assertEquals(m1.rightMostDigit(array)[0],2);
		
		//testing multiple values
		array = new Integer[] { 40,-12,234,-3356,48,510 };
		Integer[] expectedArray = { 0,2,4,6,8,0 };
		array = m1.rightMostDigit(array);
		for (int i = 0; i<array.length; i++) {
			assertEquals(expectedArray[i],array[i]);
		}
	}
	
	@Test
	void multByTwoTest() {
		Functional m1 = new Functional();
		
		//single value test
		Integer[] array = { 2 };
		assertEquals(4,m1.multByTwo(array)[0]);
		
		//testing multiple values
		array = new Integer[] { 0,1,2,3,4,5 };
		Integer[] expectedArray = { 0,2,4,6,8,10 };
		m1.multByTwo(array);
		for (int i = 0; i<array.length; i++) {
			assertEquals(array[i],expectedArray[i]);
		}
		
	}
	
	/**
	 * On the example, it only removed lower-case x
	 */
	@Test
	void removeXTest() {
		Functional m1 = new Functional();
		
		//test case with no x
		String [] array = {"true", "false", "potato"};
		String [] array2 = m1.removeX(array);
		for (int i = 0; i<array2.length; i++) {
			assertEquals(array2[i],array[i]); 
		}
		
		//testing single x
		array[0] = "Trix is for kids";
		array2 = m1.removeX(array);
		assertEquals(array2[0], "Tri is for kids");
		
		//testing only x's and spaces
		array[0] = "xxxx xx xxx xxxx";
		array2 = m1.removeX(array);
		assertEquals(array2[0], "   ");
	}
	

}
