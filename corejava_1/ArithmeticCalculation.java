package corejava_1;
import java.util.*;
class Arithmetic
{
	int a,b;
	void addition(int a , int b)
	{
		System.out.println("Addition of "+a+" and "+b+" : "+(a+b));
	}
	void subtraction(int a , int b)
	{
		System.out.println("Subtraction of "+a+" and "+b+" : "+(a-b));
	}
	void multiplication(int a , int b)
	{
		System.out.println("Multiplication of "+a+" and "+b+" : "+(a*b));
	}
	void division(int a , int b)
	{
		System.out.println("Division of "+a+" and "+b+" : "+(a/b));
	}


}

public class ArithmeticCalculation {

	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		 System.out.println("Enter a : ");
		 int a=scan.nextInt();
		 System.out.println("Enter b : ");
		 int b=scan.nextInt();
		 Arithmetic ob=new Arithmetic();
		 ob.addition(a, b);
		 ob.division(a, b);
		 ob.subtraction(a, b);
		 ob.multiplication(a, b);
	}

}
