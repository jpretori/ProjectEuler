package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem010Test {
	Problem010 pt = new Problem010();

	@Test
	void problem010_17() {
		assertEquals(41, pt.primeSummation(17));
	}

	@Test
	void problem010_2001() {
		assertEquals(277050, pt.primeSummation(2001));
	}

	@Test
	void problem010_140759() {
		assertEquals(873608362, pt.primeSummation(140759));
	}

	@Test
	void problem010_2000000() {
		assertEquals(142913828922L, pt.primeSummation(2000000));
	}

}
