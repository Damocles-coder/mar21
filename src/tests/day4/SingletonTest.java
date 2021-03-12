package tests.day4;

import static org.junit.jupiter.api.Assertions.*;
import com.smoothstack.jb.day4.Singleton;
import org.junit.jupiter.api.Test;

/**
 * @author dyltr
 *Test the Singleton class
 */
class SingletonTest {
	
	@Test
	void getInstanceTest() {
		//tests if it returns something not null
		assertNotNull(Singleton.getInstance());
		
		//tests if instance is the correct type
		assertEquals(Singleton.class.getName(),Singleton.getInstance().getClass().getName());
	}

}
