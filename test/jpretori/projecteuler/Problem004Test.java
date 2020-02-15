package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem004Test {

	Problem004 pt = new Problem004();
	@Test
	void problem004() {
		long largestPalindrome = pt.largestPalindrome(3);
		assertEquals(906609, largestPalindrome);
	}

}
