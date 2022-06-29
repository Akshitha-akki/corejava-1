package corejava_1;
class Rectangle
{
	
	Rectangle(int a,int b)
	{
		System.out.println("Area of Rectangle:"+a*b);
	}
	Rectangle ()
	{
		int a=2,b=3;
		System.out.println("Area of Rectangle:"+a*b);
	
	}
}

public class RectangleDemo {

	public static void main(String[] args) {
		//parameterized constructor
		Rectangle r=new Rectangle(1,4);
		//default constructor 
		Rectangle r1=new Rectangle();
	}

}
