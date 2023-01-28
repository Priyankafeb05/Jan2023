
//(((((10/2)-2)+2)-2)*2)

package Class2;
public class Assignmet2 
{
	public int Div(int a, int b) 
	{
		int result1 = a/b;
		return result1;
	}
	public int Sub(int a1, int b1) 
	{
		int result2 = a1-b1;
		return result2;
	}
	public int Add(int a3, int b3) 
	{
		int result3 = a3+b3;
		return result3;
		}
	public int Multi(int a4, int b4) 
	{
		int result4 = a4*b4;
		System.out.println("Final result of  (((((10/2)-2)+2)-2)*2) = "+result4);
	return	result4;
		
	}
	public static void main(String[] args) {
		
		 Assignmet2 obj1 = new Assignmet2();
		int DIV =obj1.Div(10, 2);
		int SUB= obj1.Sub(DIV, 2);
		int ADD = obj1.Add(SUB, 2);
		int SUB1=obj1.Sub(ADD, 2);
		obj1.Multi(SUB1, 2);
	}
}
