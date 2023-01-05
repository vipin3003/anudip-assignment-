package fiboRevThread;

public class Thread1 extends Thread {

	FiboRev f;
    
	// Parameterized Constructor
	public Thread1(FiboRev f) 
	{
		this.f=f;
	}
	
	@Override
	public void run() {
		f.fibo();
	}
	
}
