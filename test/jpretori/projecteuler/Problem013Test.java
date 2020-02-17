package jpretori.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Problem013Test {

	Problem013 pt = new Problem013();
	
	@Test
	void test_small() {
		ArrayList<String> testNums = new ArrayList<String>();
		testNums.add("37107287533902102798797998220837590246510135740250");
		testNums.add("46376937677490009712648124896970078050417018260538");
		
		long result = pt.largeSum(testNums);
		assertEquals(8348422521L, result);
	}
	
	@Test
	void test_large() throws IOException {
		ArrayList<String> nums = new ArrayList<String>(100);
		FileReader fr = new FileReader("test/resources/problem013.data");
		BufferedReader br = null;
		try {
			br = new BufferedReader(fr);
			String num = br.readLine();
			while (num != null) {
				nums.add(num);
				num = br.readLine();
			}
			
			long result = pt.largeSum(nums);
			assertEquals(5537376230L, result);
		} finally {
			if (br != null) {
				br.close();
			}
		}
	}

}
