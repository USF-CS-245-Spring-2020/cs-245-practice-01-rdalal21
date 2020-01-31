
public class Practice01MathRecursive implements Practice01Math  {

	 /*
     * This function implements Fibonacci  recursive function.
     */
	public int fib (int n)
	 {
        //use recursion
        if (n == 0) {
           return 0;
        }
        else if (n == 1) {

            return 1;
        }   
     return fib(n - 1) + fib(n - 2);
    }
	
	
	 /*
     * This function implements Factorial recursive function.
     */
	public int fact (int n)
	{
		if (n < 0) {
		    throw new IllegalArgumentException();
		}
		  if (n <= 1)
		      return 1;
		   else
		      return n * fact(n - 1);
		 
	}
	
	
	
}
