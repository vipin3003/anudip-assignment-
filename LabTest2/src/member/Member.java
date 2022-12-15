package member;

public class Member {

	private String name;
	private String age;
	private String phone_no;
	private Address address;
	private long salary;
	
	Member(){}
	Member(String name,String age,String phone_no,Address address,long salary)
	{
		this.name=name;
		this.age=age;
		this.phone_no=phone_no;
		this.address=address;
		this.salary=salary;
	}
	
	public void print()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Phone no. :"+phone_no);
		System.out.println("Address :"+address);
		System.out.println("Salary :"+salary);
	}
	

}
