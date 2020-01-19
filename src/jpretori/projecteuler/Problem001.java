package jpretori.projecteuler;

public class Problem001 {
	public long multiplesOf3and5(long max) {
		long result = 0;
		for (long i = 0; i < max; i++) {
		    if ((i % 3 == 0) || (i % 5 == 0)) {
		        result = result + i;
		      }
		}
		return result;
	}
}
