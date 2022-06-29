package corejava_1;

public class Static {
	String name ;
	int roll_no;
	//static variables
	static String institute ="EduBridge";
	static String course="JavaFullStackDevelopment";
	public Static(String name,int roll_no) 
	{
		this.name=name;
		this.roll_no=roll_no;
	}
   	void display()
	{
		System.out.println(name+" "+roll_no+" "+institute+" "+course);
	}
    static void Display()//static method 
    {
    	System.out.println("Welcome");
    }
	public static void main(String[] args) {
		Static s1=new Static("Akshitha",36);
		Static s2=new Static("Ashritha",38);
		s1.display();
		s2.display();
		Static.Display();
	}

}
