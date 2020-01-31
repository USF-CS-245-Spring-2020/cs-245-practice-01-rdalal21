
public class Practice01MathIterative implements Practice01Math {
	
	 /*
     * This function implements Fibonacci iterative function.
     */

	public int fib (int n)
	    { 
	        int a = 0, b = 1, c; 
	   
	        if (n == 0) 
	            return a; 
	        for (int i = 2; i <= n; i++) 
	        { 
	            c = a + b; 
	            a = b; 
	            b = c; 
	        } 
	        return b; 
	    } 
	
	
	 /*
     * This function implements Factorial iterative function.
     */
	public int fact (int n)

	{
		if (n < 0) {
		    throw new IllegalArgumentException();
		}
	  int result = 1;
	   for ( int j=1; j<=n; j++ )
	    result *= j;
	  return result;
	}

}
