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
		assertNotNull(Singleton.getInstance());
	}

}
