package corejava_1;
class Class1
{
	String str="A";
	void display()
	{
		System.out.println("class_1 "+str);
	}
}
class Class2 extends Class1
{
	void display()
	{
		System.out.println("class_2 "+str);
	}
}
class Class3 extends Class1
{
	void display()
	{
		super.display();
		System.out.println("class_3 "+str);
	}
}
public class Hybrid_Inheritance extends Class3 {
  public static void main(String[] args)
  {
	  Hybrid_Inheritance obj=new Hybrid_Inheritance();
	  obj.display();
	  Class2 c=new Class2();
	  c.display();
  }
}
