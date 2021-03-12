package tests.day4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.smoothstack.jb.day4.Line;

class LineTest {

	Line a;
	Line b;
	
	@Test
	void getSlopeTest() {
		//Expected slope of 1
		a = new Line(0.0, 0.0,2.0,2.0);
		assertEquals(1, a.getSlope(),.0001, "Fail positive slope");
		
		//Expected slope of -1
		a = new Line(0.0, 0.0,2.0,-2.0);
		assertEquals(-1, a.getSlope(),.0001, "Fail negative slope");

		//Expected ArithmeticException: vertical line
		a = new Line(0.0, 2.0,0.0,1.0);
		assertThrows(ArithmeticException.class, () -> a.getSlope(), "Fail Infinite Slope");
	}
	
	@Test
	void getDistanceTest() {
		//vertical line: expected 1
		a = new Line(0.0, 2.0,0.0,1.0);
		assertEquals(1, a.getDistance(), .0001, "Fail Vertical Line Distance");
		
		//point: expected 0
		a = new Line(0.0, 2.0,0.0,2.0);
		assertEquals(0, a.getDistance(), .0001, "Fail Point Line Distance");
		
		//Slanted line: expected sqrt of 2
		a = new Line(0,0,1,1);
		assertEquals(Math.sqrt(2),a.getDistance(),.0001, "Fail Slanted Line Distance");
	}
	
	@Test
	void parallelToTest() {
		//parallel
		a = new Line(0.0, 2.0,3.0,2.0);
		b = new Line(0.0, 2.0,4.0,2.0);
		assertTrue(a.parallelTo(b), "Not parallel");
		
		//not parallel
		b = new Line(0.0, 2.0,4.0,3.0);
		assertFalse(a.parallelTo(b), "Parallel");
	}

}
