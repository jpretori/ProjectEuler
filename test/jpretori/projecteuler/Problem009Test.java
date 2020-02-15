package jpretori.projecteuler;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem009Test {

	Problem009 pt = new Problem009();

	@Test
	void problem009_1000() {
		long pythagoreanTripletProduct = pt.pythagoreanTripletProduct(1000);
		assertEquals(31875000, pythagoreanTripletProduct);
	}

	@Test
	void problem009_24() {
		long pythagoreanTripletProduct = pt.pythagoreanTripletProduct(24);
		assertEquals(480, pythagoreanTripletProduct);
	}

	@Test
	void problem009_120() {
		long pythagoreanTripletProduct = pt.pythagoreanTripletProduct(120);
		
		boolean matched = 
				(pythagoreanTripletProduct == 49920) || 
				(pythagoreanTripletProduct == 55080) || 
				(pythagoreanTripletProduct == 60000);
		
		assertTrue(matched);
	}

}
