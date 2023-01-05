package demandSupply;

public class SupplyThread extends Thread{

	Producer p;
	
	// Parameterized Constructor
	SupplyThread(Producer p)
	{
		this.p=p;
	}
	
	@Override
	public void run()
	{
		p.supply(100);
	}
}
