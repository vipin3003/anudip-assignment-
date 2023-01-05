package demandSupply;

public class Main {

	public static void main(String[] args) {
		
		Producer p = new Producer(1000);
		
		// Objects of Thread
		DemandThread dt = new DemandThread(p);
		SupplyThread st = new SupplyThread(p);
		
		// Starting Threads
		dt.start();
		st.start();

	}

}
