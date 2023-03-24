package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = (int) test.divide(4,2);
		assertEquals(2,output);
	}

}
