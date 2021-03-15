package tests.wk1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.smoothstack.jb.wk1.Lambdas;
import com.smoothstack.jb.wk1.PerformOperation;

class LambdaTest {
	Lambdas m1;
	PerformOperation p1;

	@Test
	void isOddTest() {
		m1 = new Lambdas();
		p1 = m1.isOdd();
		assertEquals(p1.operate(10),false);
		assertEquals(p1.operate(1),true);
	}
	
	@Test
	void isPrimeTest() {
		m1 = new Lambdas();
		p1 = m1.isPrime();
		assertEquals(p1.operate(2),true);
		assertEquals(p1.operate(1),false);
		assertEquals(p1.operate(5),true);
		assertEquals(p1.operate(4),false);
	}
	
	@Test
	void isPalindromeTest() {
		m1 = new Lambdas();
		p1 = m1.isPalindrome();
		assertEquals(p1.operate(10),false);
		assertEquals(p1.operate(1),true);
		assertEquals(p1.operate(101),true);
	}

}
