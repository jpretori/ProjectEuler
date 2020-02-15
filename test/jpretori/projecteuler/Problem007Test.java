package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem007Test {

	Problem007 pt = new Problem007();
	@Test
	void problem007() {
		long nthPrime = pt.nthPrime(10001);
		assertEquals(104743, nthPrime);
	}

}
