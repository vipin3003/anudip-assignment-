package checkEmail;
import java.util.Scanner;

public class CheckEmail {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Input from user 
		System.out.print("Enter emailId :");
		String email = sc.next();
		
		// checking exception 
		try 
		{ 
			if (!email.contains(".") || !email.contains("@") || !email.substring(email.indexOf("@")).contains("."))
			{
				throw new InvalidMailIdException("Invalid email id"); 
			}
			System.out.println("valid!!");
		} 
		
		catch (InvalidMailIdException e) 
		{
			System.out.println(e); 
		}
			    
		finally
		{
			sc.close(); 
		}
		
		
	}
}
