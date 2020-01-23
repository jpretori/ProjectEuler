package jpretori.projecteuler;

public class Problem007 {

	public long nthPrime(int n) {
		int i = 2;
		long candidate = 3;
		while (i < n) {
			candidate += 2; //Even numbers other than 2 can never be prime
			
			if (ToolPack.isPrime(candidate)) {
				i++;
			}
		}
		
		return candidate;
	}
}
