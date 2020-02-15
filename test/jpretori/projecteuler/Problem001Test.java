package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Problem001Test {
			
	@Test
	void problem001() {
		Problem001 pt = new Problem001();
		assertEquals(233168, pt.multiplesOf3and5(1000));
	}
}
