package jpretori.projecteuler;

public class Problem008 {

	public long largestProduct(int num_digits, String tdn) {
		String substring = null;
		long candidate = 0;
		long result = 0;
		
		for (int start_index = 0; start_index < (tdn.length() - num_digits + 1); start_index++) {
			substring = tdn.substring(start_index, start_index+num_digits); 
			candidate = multiplyDigits(substring);
			if (candidate > result) {
				result = candidate;
			}
		}
		
		return result;
	}

	private long multiplyDigits(String substring) {
		long result = 1;
		for (int i = 0; i < substring.length(); i++) {
			long nextDigit = Long.parseLong(substring.substring(i, i+1));
			result *= nextDigit;
		}		
		return result;
	}

}
