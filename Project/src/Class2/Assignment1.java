//(((((10+2)+2)-2)*2)/2)

package Class2;

public class Assignment1 
{
	
	public int Add(int a, int b) 
	{
		int result1 = a+b;
		return result1;
		}
	
	public int Sub(int a1, int b1) 
	{
		int result2 = a1-b1;
		return result2;
	}
	
	public int Multi(int a3, int b3) 
	{
		int result3 = a3*b3;
		
	return	result3;
		
	}
	public int Div(int a4, int b4) 
	{
		int result4 = a4/b4;
		System.out.println("Final result of  (((((10+2)+2)-2)*2)/2) = "+result4);
		return result4;
	}
	public static void main(String[] args) {
		
		 Assignment1 obj1 = new Assignment1();
		int ADD =obj1.Add(10, 2);
		int ADD1= obj1.Add(ADD, 2);
		int SUB = obj1.Sub(ADD1, 2);
		int MULTI=obj1.Multi(SUB, 2);
		obj1.Div(MULTI, 2);
	}
}
