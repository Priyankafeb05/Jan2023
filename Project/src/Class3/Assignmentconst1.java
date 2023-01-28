//Output should be in the below sequencew with single object
//three parameterized constructor
//default constructor
//one parameterized constructor
//four parameterized constructor
//two parameterized constructor 


package Class3;

public class Assignmentconst1 {
	
	public Assignmentconst1()
	{
		this(87,88,77);
		System.out.println("Default");
	}
	public Assignmentconst1(int b)
	{
		this();
		System.out.println("Single parameterized constructor");
	}
	public Assignmentconst1(int a, int b)
	{
		this(777,66,668,5);
		System.out.println("two parameterized constructor");;
	}
	public Assignmentconst1(int a1, int b1, int c1)
	{
		
		System.out.println("Three parameterized constructor");;
	}
	public Assignmentconst1(int a2, int b2,int c2, int d2)
	{
		this(23);
		System.out.println("Four parameterized constructor");
	}
	public static void main(String[] args) {
		Assignmentconst1 obj= new Assignmentconst1(33,33);
		
	}
}
