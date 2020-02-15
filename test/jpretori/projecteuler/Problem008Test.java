package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem008Test {

	Problem008 pt = new Problem008();
	@Test
	void problem008_04digit() {
		long largestProduct = pt.largestProduct(4);
		assertEquals(5832, largestProduct);
	}

	@Test
	void problem008_13digit() {
		long largestProduct = pt.largestProduct(13);
		assertEquals(23514624000L, largestProduct);
	}

}
