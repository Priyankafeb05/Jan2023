package Class5;

import java.util.Scanner;

public class Assignment2 {
	public int add(int a ,int b)
	{
		int return1= a+b;
		return return1;
	}
	
	public int sub(int a1 ,int b1)
	{
		int return2= a1-b1;
	return	return2;
	}
	public int multi(int a2 ,int b2)
	{
		int return3= a2*b2;

	return	return3;
	}
	
	public int div(int a3 ,int b3)
	{
		int return4= a3/b3;
		
	return	return4;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Value of X1");
		int val=s.nextInt();
		System.out.println("Value of X2" );
		int val1=s.nextInt();
		System.out.println("Value of X3" );
		int val2=s.nextInt();
		System.out.println("Value of X4" );
		int val3=s.nextInt();
		System.out.println("Value of X5" );
		int val4=s.nextInt();
		System.out.println("Value of X6" );
		int val5=s.nextInt();
		Assignment2 obj=new Assignment2();
		int value1=obj.multi(val, val1);
		int value2=obj.sub(value1, val2);
		int value3=obj.add(value2, val3);
		int value4=obj.sub(value3, val4);
		int value5=obj.div(value4, val5);
		System.out.println("The Final Result (X1*X2)-X3)+X4)-X5)/X6 = " +value5);
				
	}
}

















