package Array;
import java.util.Arrays;

public class RotateCyclicallyByOne
{
	/*
	//Method 1: Using variable
  
	static int arr[] = new int[]{1,2,3,4,5};
	static void rotate()
	{
		int x = arr[arr.length-1],i;
		for(i=arr.length -1; i>0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = x;
		
	}
	public static void main(String args[])
	{
		System.out.println("Given array is: ");
		System.out.println(Arrays.toString(arr));
		rotate();
		System.out.println("Rotated array is: ");
		System.out.println(Arrays.toString(arr));
		
	}
	*/
	
	//Method 2: using pointers
	static int arr[] = new int[] {1,2,3,4,5};
	static void rotate()
	{
		int i=0, j = arr.length - 1;
		while(i != j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Given array is: ");
		System.out.println(Arrays.toString(arr));
		rotate();
		System.out.println("Rotated arrays is: ");
		System.out.println(Arrays.toString(arr));
	}
}
