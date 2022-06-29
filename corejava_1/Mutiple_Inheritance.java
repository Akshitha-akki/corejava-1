package corejava_1;

public class Mutiple_Inheritance implements Square,Square_Root 
{
	public void squareRoot(int b) 
	{
		 System.out.println("Square Root : "+((int)(Math.sqrt(b))));
	} 
	public void square(int a) 
	{
		 System.out.println("Square : "+(a*a));	
	}
	
	public static void main(String[] args) 
	{
		 Mutiple_Inheritance obj=new Mutiple_Inheritance();
		 obj.square(2);
		 obj.squareRoot(16);
	}
}
