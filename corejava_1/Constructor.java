package corejava_1;
class ConstructorDemo
{
	int x;
	ConstructorDemo(int i) 
	{
		x=i;
	}
/*	ConstructorDemo(int x) 
	{
		this.x=x;
	}*/
}
public class Constructor {

	public static void main(String[] args) 
	{
		 ConstructorDemo c1=new ConstructorDemo(10);
		 ConstructorDemo c2=new ConstructorDemo(20);
		 System.out.println("c1 : "+c1.x+"\n"+"c2 : "+c2.x);
	}

}
