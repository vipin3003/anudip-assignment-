package member;

public class MemberMain {

	public static void main(String[] args) {
		
		 
		Address a1 = new Address("H 520","VPuram","Vijay Nagar");
		Address a2 = new Address("G 420","Pool","Goa");

		System.out.println("");
		
		System.out.println("Employee");
		Employee ep = new Employee("Vipin","21","0192837465",a1,999999,"Programming");
		ep.print();
		
		System.out.println("");
		
		System.out.println("Manager");
		Manager mg = new Manager("Devu","30","1100229933",a2,999999,"CS");
		mg.print();
		

	}

}
