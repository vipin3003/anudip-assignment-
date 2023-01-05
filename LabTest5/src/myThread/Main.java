package myThread;

public class Main {

	public static void main(String[] args) {

		// Objects of Threads
		Thread th1 = new MyFriend();
		Thread th2 = new MyFriend();
		Thread th3 = new MyFriend();
		
		// Starting Threads
		th1.start();
		th2.start();
		th3.start();

	}

}
