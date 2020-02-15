package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem012Test {

	@Test
	void test_5() {
		Problem012 pt = new Problem012();
		long result = pt.divisibleTriangleNumber(5);
		assertEquals(28, result);
	}

	@Test
	void test_23() {
		Problem012 pt = new Problem012();
		long result = pt.divisibleTriangleNumber(23);
		assertEquals(630, result);
	}

	@Test
	void test_167() {
		Problem012 pt = new Problem012();
		long result = pt.divisibleTriangleNumber(167);
		assertEquals(1385280, result);
	}

	@Test
	void test_374() {
		Problem012 pt = new Problem012();
		long result = pt.divisibleTriangleNumber(374);
		assertEquals(17907120, result);
	}

	@Test
	void test_500() {
		Problem012 pt = new Problem012();
		long result = pt.divisibleTriangleNumber(500);
		assertEquals(76576500, result);
	}
}
