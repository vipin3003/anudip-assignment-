package fiboRevThread;

public class Thread2 extends Thread {
	
	FiboRev r;
    
	// Parameterized Constructor
	public Thread2(FiboRev r) 
	{
		this.r=r;
	}
	
	@Override
	public void run() {
		r.rev();
	}

}
