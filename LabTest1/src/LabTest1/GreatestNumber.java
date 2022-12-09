package LabTest1;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		//Taking Input From The User.
		System.out.println("Enter 3 No. To Compare");
		System.out.print("a : ");
		int a=sc.nextInt(); 
		System.out.print("b : ");
		int b=sc.nextInt();
		System.out.print("c : ");
		int c=sc.nextInt();
		
		
		if(a>b)
		{
			if(b>c)
				System.out.println("A is greatest.");
			else
				System.out.println("C is greatest.");
		}
		else
		{
			if(b>c)
			System.out.println("B is greatest.");
			else
			System.out.print("C is grestest.");
		}

	}

}
