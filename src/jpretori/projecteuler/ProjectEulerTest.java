package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProjectEulerTest {
	@Test
	void problem007() {
		Problem007 pt = new Problem007();
		assertEquals(104743, pt.nthPrime(10001));
	}

	@Test
	void problem006() {
		Problem006 pt = new Problem006();
		assertEquals(25164150, pt.sumSquareDifference(100));
	}
	
	@Test
	void problem005() {
		Problem005 pt = new Problem005();
		assertEquals(232792560, pt.smallestMultiple(20));
	}
	
	@Test
	void problem004() {
		Problem004 pt = new Problem004();
		assertEquals(906609, pt.largestPalindrome(3));
	}
	
	@Test
	void problem003() {
		Problem003 pt = new Problem003();
		assertEquals(6857, pt.largestPrimeFactor(600851475143L));
	}
	
	@Test
	void problem002() {
		Problem002 pt = new Problem002();
		assertEquals(4613732, pt.sumEvenFiboUpToMaxN(4000000));
	}
	
	@Test
	void problem002_fcc10() {
		Problem002 pt = new Problem002();
		assertEquals(44, pt.sumEvenFiboUpToNthFibo(10));
	}
	
	@Test
	void problem002_fcc18() {
		Problem002 pt = new Problem002();
		assertEquals(3382, pt.sumEvenFiboUpToNthFibo(18));
	}
	
	@Test
	void problem002_fcc23() {
		Problem002 pt = new Problem002();
		assertEquals(60696, pt.sumEvenFiboUpToNthFibo(23));
	}
	
	@Test
	void problem002_fcc43() {
		Problem002 pt = new Problem002();
		assertEquals(350704366, pt.sumEvenFiboUpToNthFibo(43));
	}
	
	@Test
	void problem001() {
		Problem001 pt = new Problem001();
		assertEquals(233168, pt.multiplesOf3and5(1000));
	}
}
