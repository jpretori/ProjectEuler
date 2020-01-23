package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProjectEulerTest {
	
	private static final String THOUSAND_DIGIT_NUMBER = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

	@Test
	void problem008_04digit() {
		Problem008 pt = new Problem008();
		assertEquals(5832, pt.largestProduct(4, THOUSAND_DIGIT_NUMBER));
	}

	@Test
	void problem008_13digit() {
		Problem008 pt = new Problem008();
		assertEquals(23514624000L, pt.largestProduct(13, THOUSAND_DIGIT_NUMBER));
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
