package jpretori.projecteuler;

public class ProblemTwo {
    public static void main (String[] args) {

    	ProblemTwo pt = new ProblemTwo();
    	System.out.println("Testing");
   	
		pt.test(4000000, 4613732);

    	System.out.println(
    		"Seems OK.  Now some random inputs, making sure the output is always an " + 
			"even number");
    	for (int i = 0; i < 5; i++) {
    		//	generate random number as large as you like
    		long random_input = Math.round(Math.random() * 1000);
    		long result = pt.sumEvenFibo(random_input);
    		System.out.println("Input of [" + random_input + "] ... result of [" + result + "]");
    		assert(result % 2 == 0);
    	}
    
    	if (args != null && args.length > 0) {
    		System.out.println("------- ------- -------");
    		System.out.println("Sum of all even Fibonacci numbers not exceeding " + args[0] + " is [" + pt.sumEvenFibo(Long.parseLong(args[0])) + "]");
    	}
    }

    private void test(long input, long expected_result) {
    	System.out.print(input + " ... ");
    	long result = sumEvenFibo(input);
    	System.out.println("[" + result + "]");
    	assert(result == expected_result);
    }
    
    public long sumEvenFibo(long max) {
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
}
