package Class2;

public class Arthmetic 
{
	
	public int Sum(int a ,int b) 
	{
		int result1 = a+b;
		System.out.println("Sum is Equal to" +result1);
		return result1;
		
	}
	public int Sub(int a2 ,int b2) 
	{
		int result3 = a2-b2;
		System.out.println("Sum is Equal to" +result3);
		return result3;
		
	}
	public int Multi(int a1 ,int b1) 
	{
		int result3 = a1*b1;
		System.out.println("Final result  is Equal to  "+result3);
		return result3;
		
	}
public static void main(String[] args) {
	
	Arthmetic obj1= new Arthmetic();
			int SUM=obj1.Sum(10,20);
			 int SUB=obj1.Sub(40, 30);
			obj1.Multi(  SUM,  SUB);
	
}
}
