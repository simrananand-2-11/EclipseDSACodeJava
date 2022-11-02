package Array;

public class MultiDimensionalArray 
{
	public static void main(String args[])
	{
		int arr[][] 
				= {{2,7,9}, {8,5,7},{1,2,3}};
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
}
