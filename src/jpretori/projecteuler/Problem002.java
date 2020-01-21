package jpretori.projecteuler;

public class Problem002 {
    public long sumEvenFiboUpToMaxN(long max) {
    	long fibo_small = 1;
    	long fibo_large = 2;
    	long fibo_next = 3;

    	long even_fibo_sum = 0;
	
    	while (fibo_large <= max) {
    		if ((fibo_large % 2) == 0) {
    			even_fibo_sum += fibo_large;
    		}
    		
    		fibo_small = fibo_large;
    		fibo_large = fibo_next;
    		fibo_next = fibo_small + fibo_large;
    	}
    	return even_fibo_sum;			
    }
    
    public long sumEvenFiboUpToNthFibo(int max_fibo_index) {
    	long fibo_small = 1;
    	long fibo_large = 2;
    	long fibo_next = 3;

    	long even_fibo_sum = 0;
	
    	int fibo_large_index = 2;
    	
    	while (fibo_large_index++ <= max_fibo_index) {
    		if ((fibo_large % 2) == 0) {
    			even_fibo_sum += fibo_large;
    		}
    		
    		fibo_small = fibo_large;
    		fibo_large = fibo_next;
    		fibo_next = fibo_small + fibo_large;
    	}
    	return even_fibo_sum;			
    }
}
