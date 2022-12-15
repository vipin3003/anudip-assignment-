package member;

public class Address {
	//data members
	String hno;
	String area;
	String city;
	
	//parameterized constructor
	Address(String hno,String area,String city) 
	{
		this.hno=hno;
		this.area=area;
		this.city=city;
	}

	@Override // creating to string method
	public String toString() {
		return "Address [hno=" + hno + ", area=" + area + ", city=" + city + "]";
	}


}
