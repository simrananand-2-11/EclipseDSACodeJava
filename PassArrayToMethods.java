package Array;

public class PassArrayToMethods 
{
	public static void main(String args[])
	{
		int arr[] = {3,1,2,5,2};
		sum(arr);
		
	}
	
	public static void sum(int[] arr)
	{
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
		}
		
		System.out.println("Sum of array values: "+sum);
	}
}
