package member;

public class Manager extends Member {

	private String department;
	
	//Parameterized Constructor
	Manager(String name,String age,String phoneno,Address address,long salary,String department)
	{
		super(name,age,phoneno,address,salary);
		this.department=department;
	}
	
	//printing info
	public void print()
	{
		super.print();
		System.out.println("Specialization :"+department);
	}
}
