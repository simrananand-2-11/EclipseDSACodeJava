package Array;

/*
class Student
{
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}
*/

/*
//Method 1
 
public class ArrayOfObjects 
{
	public static void main(String args[])
	{
		Student[] arr;
		arr = new Student[5];
		
		arr[0] = new Student(1,"Aman");
		arr[1] = new Student(2,"Dharmesh");
		arr[2] = new Student(3,"Mohit");
		arr[3] = new Student(4,"Shikhar");
		arr[4] = new Student(5,"Vaibhav");
		
		for(int i=0;i< arr.length;i++)
		{
			System.out.println("Element at "+i+" : "+arr[i].roll_no+" "+arr[i].name);
		}
		
	}
}

*/


class Student
{
	public String name;
	Student(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
	
}



public class ArrayOfObjects
{
	public static void main(String args[])
	{
		Student[] myStudent = new Student[] {new Student("Sharma"), new Student("Ravi"), new Student("Ajay"), new Student("Mohan"), new Student("Kabita")};
		
		for(Student s: myStudent)
		{
			System.out.println(s);
		}
	}
}
