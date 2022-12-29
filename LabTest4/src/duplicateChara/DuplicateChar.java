package duplicateChara;
import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Input From User
		System.out.print("Enter a String :");
		String s = sc.next();
		
		// Convert string to char array
		char[] ch = s.toCharArray();
		
		
		System.out.print("Duplicate Characters: ");
		
		// Calling Method
		checkDuplicate(s,ch);
		
		sc.close();
		
	}
	
	// Check duplicate character in array
	public static void checkDuplicate(String str,char[] ch)
	{
		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = i + 1; j < str.length(); j++) 
			{
	            if (ch[i] == ch[j]) 
	            {
	               System.out.print(ch[j] + " ");
	               break;
	            }
			}
		}
		
	}

}
