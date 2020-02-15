package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem003Test {

	Problem003 pt = new Problem003();
	@Test
	void problem003() {
		long largestPrimeFactor = pt.largestPrimeFactor(600851475143L);
		assertEquals(6857, largestPrimeFactor);
	}

}
