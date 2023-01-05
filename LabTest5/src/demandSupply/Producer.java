package demandSupply;

public class Producer {

	int availableProducts;
	
	// Parameterized Constructor
	Producer(int availableProducts)
	{
		this.availableProducts=availableProducts;
	}
	
	// Function for demand
	synchronized void demand(int n)
	{
		System.out.println("Available Product :"+availableProducts);
		
		if (n>availableProducts)
		{
			try {
				  wait();
				}catch(InterruptedException ie)
			     {
					ie.printStackTrace();
					
			     }
			}
			
		availableProducts-=n;
		System.out.println("Available Products after demant fulfillment :"+availableProducts);
			
	}
	
	
	// Function for add supply to available products
	synchronized void supply(int n)
	{	
		availableProducts+=n;
		
		System.out.println("Available Products after receiving supply :"+availableProducts);
		notify();
	}
}
