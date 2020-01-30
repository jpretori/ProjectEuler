package jpretori.projecteuler;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProjectEulerTest {

	@Test
	void problem010_17() {
		Problem010 pt = new Problem010();
		assertEquals(41, pt.primeSummation(17));
	}

	@Test
	void problem010_2001() {
		Problem010 pt = new Problem010();
		assertEquals(277050, pt.primeSummation(2001));
	}

	@Test
	void problem010_140759() {
		Problem010 pt = new Problem010();
		assertEquals(873608362, pt.primeSummation(140759));
	}

	@Test
	void problem010_2000000() {
		Problem010 pt = new Problem010();
		assertEquals(142913828922L, pt.primeSummation(2000000));
	}

	@Test
	void problem009_1000() {
		Problem009 pt = new Problem009();
		assertEquals(31875000, pt.pythagoreanTripletProduct(1000));
	}

	@Test
	void problem009_24() {
		Problem009 pt = new Problem009();
		assertEquals(480, pt.pythagoreanTripletProduct(24));
	}

	@Test
	void problem009_120() {
		Problem009 pt = new Problem009();
		
		long pythagoreanTripletProduct = pt.pythagoreanTripletProduct(120);
		
		boolean matched = 
				(pythagoreanTripletProduct == 49920) || 
				(pythagoreanTripletProduct == 55080) || 
				(pythagoreanTripletProduct == 60000);
		
		assertTrue(matched);
	}

	@Test
	void problem008_04digit() {
		Problem008 pt = new Problem008();
		assertEquals(5832, pt.largestProduct(4));
	}

	@Test
	void problem008_13digit() {
		Problem008 pt = new Problem008();
		assertEquals(23514624000L, pt.largestProduct(13));
	}
	
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
