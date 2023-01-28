////four parameterized method
//default method
//one parameterized method
//three parameterized method
//two parameterized method



package Class3;

public class Assignmentconst2 {
	
	public void met()
	{
	System.out.println("default method");
		}
	
	public void met1( )
	{
	System.out.println("one parameterized method");
		}
	public void met2()
	
	{
		this.met4();
		this.met();
		this.met1();
		this.met3();
		System.out.println("two parameterized method");
	
		}
	public void  met3()
	{
		
		System.out.println("three parameterized method");
		}
	public void met4()
	{
		System.out.println("Four parameterized method");
		}
	public static void main(String[] args) {
		
	
	 Assignmentconst2 obj1=new Assignmentconst2();
	 obj1.met2();
	 
	
	}
	
}
