package fiboRevThread;

public class Main {

	public static void main(String[] args) {
		
		FiboRev f = new FiboRev();
		
		// Objects of Threads
		Thread1 th1 = new Thread1(f);
		Thread2 th2 = new Thread2(f);
		
		// Starting Threads
		th1.start();
		th2.start();
	}

}
