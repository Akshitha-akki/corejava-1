package corejava_1;
class Students_Details
{
	String name;
	int Roll_no,age;
	
	Students_Details(String name,int Roll_no)
	{
		this.name=name;
		this.Roll_no=Roll_no;
	}
	Students_Details(String name,int Roll_no,int age)
	{
		this.name=name;
		this.Roll_no=Roll_no;
		this.age=age;
	}
	void display()
	{
		System.out.println("Name : "+name+"\nRoll_no : "+Roll_no+"Age : "+age);
	}
}
public class ConstructorOverLoading {

	public static void main(String[] args) {
		 Students_Details std=new Students_Details("Akshitha",36);
		 Students_Details std1 = new Students_Details("Akshi", 38,22);
		 std.display();
		 std1.display();

	}

}
