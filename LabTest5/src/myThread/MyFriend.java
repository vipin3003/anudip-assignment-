package myThread;

public class MyFriend extends Thread {
	
	
	@Override
	public void run()
	{
		String[] frndArr = {"Aman","Goku","Naruto","Ben","Vipin","Sahil","Gaurav","Shayam","Rajan","Ram"};
		
		for (String n : frndArr) 
		{
		    System.out.println(n);
		}
	}

}
