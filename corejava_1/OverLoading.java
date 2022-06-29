package corejava_1;

class SumOverLoading
{
	int sum(int a, int b) 
	{
	  return (a+b);
 	}
	void sum(int a ,int b, int c) 
	{
		System.out.println("Add2: "+(a+b+c)); 
	}
	double sum(int a, double b)
	{
		return (a+b);
	}
	void sum(float a ,int b)
	{
		System.out.println("Add4 :"+(a+b));
	}
}
public class OverLoading {

	public static void main(String[] args) 
	{
		SumOverLoading obj = new SumOverLoading();
		System.out.println("Add1 :"+obj.sum(10, 10));
		obj.sum(10, 10, 10);
		System.out.println("Add3 :"+obj.sum(10,10.5));
	    obj.sum(10.2f, 10);//for float we have to take the 2f or 3f.
	}

}
