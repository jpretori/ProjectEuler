package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem006Test {

	Problem006 pt = new Problem006();
	@Test
	void problem006() {
		long sumSquareDifference = pt.sumSquareDifference(100);
		assertEquals(25164150, sumSquareDifference);
	}

}
