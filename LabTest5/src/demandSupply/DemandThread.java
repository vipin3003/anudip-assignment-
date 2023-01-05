package demandSupply;

public class DemandThread extends Thread{

	Producer p;
	
	// Parameterized Constructor
	DemandThread(Producer p)
	{
		this.p=p;
	}
	
	@Override
	public void run()
	{
		p.demand(200);
	}
}
