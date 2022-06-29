package corejava_1;

class ParentClass
{
	public String s = "Srinivas";
	public String Display()
	{
		return s;	
	}
}
class ChildClass extends ParentClass
{
	@Override
	public String Display()
	{
		System.out.println(super.Display());
		return "Akshitha" ;	
	}
}
public class StringDisplay {

	public static void main(String[] args) {
		 ChildClass obj=new ChildClass();
		 System.out.println(obj.Display());
	}

}
