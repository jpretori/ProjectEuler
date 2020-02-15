package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem005Test {

	Problem005 pt = new Problem005();
	@Test
	void problem005() {
		long smallestMultiple = pt.smallestMultiple(20);
		assertEquals(232792560, smallestMultiple);
	}

}
