package corejava_1;

class SuperClass1
{
	void display()
	{
		System.out.println("SuperClass");
	}
}
class SubClass1 extends SuperClass1
{
	void display()
	{
		super.display();
		System.out.println("Subclass");
	}
}
public class Overridding {

	public static void main(String[] args) {
		SubClass1 obj=new SubClass1();
		obj.display();
	}

}
