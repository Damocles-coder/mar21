package tests.day5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.smoothstack.jb.day5.FilteringWords;

class FilteringWordsTest {

	@Test
	void filterStringTest() {
		FilteringWords m1 = new FilteringWords();
		String[] temp;
		List<String> test;
		//single qualifying word
		temp = new String[] { "war", "car" , "art"};
		test = Arrays.asList(temp);
		test = m1.filterString(test);
		assertEquals(test.get(0), "art");
		
		//no qualifying words
		temp = new String[] { "war", "car" , "earth", "arrow"};
		test = Arrays.asList(temp);
		test = m1.filterString(test);
		assertEquals(test.size(), 0);
		
	}

}
