package jpretori.projecteuler;

public class Problem006 {

	public long sumSquareDifference(int max_num) {
		long result = 0;
		
		long sum = 0;
		long sum_of_squares = 0;
		
		for (int i = 1; i <= max_num; i++) {
			sum += i;
			sum_of_squares += Math.pow(i, 2);
		}
		
		result = (long) (Math.pow(sum, 2) - sum_of_squares);
		
		return result;
	}

}
