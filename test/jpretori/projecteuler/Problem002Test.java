package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem002Test {

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

}
