package jpretori.projecteuler;

public class Problem005 {

	public long smallestMultiple(int max_divisor) {
		// The only numbers that could possibly be evenly divisible by 1..max_divisor
		// are multiples of max_divisor. So we can reduce the search space a lot by ONLY
		// looking at multiples of max_divisor.
		for (long candidate_result = max_divisor; 
				candidate_result < Long.MAX_VALUE; 
				candidate_result += max_divisor) {
			
			// For each candidate, check even divisibility by 1..max_divisor. Except that,
			// if a candidate is divisible by max_divisor, it will also be divisible by
			// max_divisor/2. So we don't need to check max_divisor/2. The same goes for
			// max_divisor-1, and so on down all the way to max_divisor/2... meaning we've
			// cut the search space in half once more.
			boolean candidate_passed = true;
			for (long i = max_divisor/2 + 1; 
					(i<= max_divisor) && candidate_passed; 
					i++) {
				candidate_passed = candidate_passed && (candidate_result % i == 0);
			}
			if (candidate_passed) {
				return candidate_result;
			} 
		}
		
		return 0;
	}

}
