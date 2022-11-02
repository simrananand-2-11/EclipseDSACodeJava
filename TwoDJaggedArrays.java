package Array;
/*
 
//Program 1

public class TwoDJaggedArrays 
{
	public static void main(String args[])
	{
		int arr[][]= new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = count++;
			}
		}
		
		System.out.println("Contents of 2 D Jagged Array: ");
		for(int i = 0; i< arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

 */


//Program 2

class TwoDJaggedArrays
{
	public static void main(String args[])
	{
		int r=5;
		int arr[][] = new int[r][];
		
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = new int[i+1];
		}
		
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j=0; j< arr[i].length; j++)
			{
				arr[i][j] = count++;
			}
		}
		
		System.out.println("Contents of 2D Jagged Array: ");
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
