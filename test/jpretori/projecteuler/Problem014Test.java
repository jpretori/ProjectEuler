package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem014Test {

	Problem014 pt = new Problem014();
	
	@Test
	void test_tree() {
		pt.createTree();
	}
	
	@Test
	void test_14() {
		int result = pt.longestCollatzSequence(14);
		assertEquals(9, result);
	}
	@Test
	void test_5847() {
		int result = pt.longestCollatzSequence(5847);
		assertEquals(3711, result);
	}
	@Test
	void test_46500() {
		int result = pt.longestCollatzSequence(46500);
		assertEquals(35655, result);
	}
	@Test
	void test_54512() {
		int result = pt.longestCollatzSequence(54512);
		assertEquals(52527, result);
	}
	@Test
	void test_100000() {
		int result = pt.longestCollatzSequence(100000);
		assertEquals(77031, result);
	}
	@Test
	void test_1000000() {
		int result = pt.longestCollatzSequence(1000000);
		assertEquals(77031, result);
	}
}
