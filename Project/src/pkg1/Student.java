
//Assignment1
package pkg1;

public class Student {
	int Rollno = 10 ;
	int Age =30 ;
	
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	public void display2()
	{
		System.out.println("automation is very easy");
	}
	
public static void main(String[] args) {
	
Student obj1 = new Student();
obj1.display1();
obj1.display2();
System.out.println(obj1.Rollno);
System.out.println(obj1.Age);
 
	}
}
