package alternate;

public class Alternate 
{
	
	// sum of alternate element
	public static void sum(int []arr2) 
	{
		int sum=0;
		for(int i=0; i<arr2.length;i++) {
			sum=sum+arr2[i];
		}
		System.out.print("Sum = "+sum);
	}
	
	
	// storing the alternate array element
	public static void alternateArray(int arr[],int arr_alt[]) {
		int j=0;
		for(int i=0; i<arr.length;i+=2,j++) 
		{
			arr_alt[j]=arr[i];
		}
		
	}
	
	public static void main(String[] args) 
	{
		// Initialize
		int []arr = {1,2,3,4,5,6,7,8,9,10};
		int l = arr.length/2;
		int []arr_alt = new int[l];
		alternateArray(arr,arr_alt);
		sum(arr_alt);
		
	}
	
	
}