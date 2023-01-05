package fiboRevThread;

public class FiboRev {

	// Function for fibonacci series
	synchronized public void fibo() 
	{
		int n = 10; 
		int f = 0; 
		int s = 1;
	
		for (int i = 1; i <= n; ++i) 
    	{
    		System.out.println(f);      
      		int nTerm = f + s;
      		f = s;
      		s = nTerm;
    	}
	}
	
	// Function for reverse counting
	synchronized public void rev() 
	{
		for (int i = 10; i >= 1; i--) 
    	{
    		System.out.println(i);      
    	}
	}
	
}
