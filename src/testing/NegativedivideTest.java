package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NegativedivideTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = (int) test.divide(7,4);
		assertEquals(3,output);	
		}

}
