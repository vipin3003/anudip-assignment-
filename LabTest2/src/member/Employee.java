package member;

public class Employee extends Member{

	private String specialization;
	
	//Parameterized Constructor
	Employee(String name,String age,String phoneno,Address address,long salary,String specialization)
	{
		super(name,age,phoneno,address,salary);
		this.specialization=specialization;
	}
	
	//printing info
	public void print()
	{
		super.print();
		System.out.println("Specialization :"+specialization);
	}
	
}
