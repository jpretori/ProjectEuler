package jpretori.projecteuler;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProjectEulerTest {

	@Test
	void problem011_full() {
		int[][] grid = {
				 {8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8},
				  {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0},
				  {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65},
				  {52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91},
				  {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
				  {24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
				  {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
				  {67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21},
				  {24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
				  {21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95},
				  {78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92},
				  {16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57},
				  {86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
				  {19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40},
				  {4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
				  {88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
				  {4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36},
				  {20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16},
				  {20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54},
				  {1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48}
				};
		
		Problem011 pt = new Problem011();
		assertEquals(70600674, pt.largestGridProduct(grid));
	}

	@Test
	void problem011_small() {
		int[][] grid = {
					{40, 17, 81, 18, 57}, 
					{74, 04, 36, 16, 29}, 
					{36, 42, 69, 73, 45}, 
					{51, 54, 69, 16, 92}, 
					{07, 97, 57, 32, 16}
				};
		
		Problem011 pt = new Problem011();
		assertEquals(14169081, pt.largestGridProduct(grid));
	}

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
