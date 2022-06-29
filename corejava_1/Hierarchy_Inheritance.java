package corejava_1;
//Super Class
class End
{
	int end;
	public void Display()
	{
		System.out.println("End : "+end);
	}
}
//Subclass 
class Backend extends End
{
	public int java,DataBase;
	int getData(int j,int d)
	{
		java=j;
		DataBase=d;
		end=(j+d)/2;
		System.out.print("Back");
		return end;
	}
}
//Subclass
class FrontEnd extends End
{
	public int react,Angular;
	int data(int r,int a)
	{
		react=r;
		Angular=a;
		end=(r+a)/2;
		System.out.print("Front");
		return end;
	}
}
public class Hierarchy_Inheritance  {

	public static void main(String[] args) {
		 Backend b=new Backend();
		 FrontEnd f=new FrontEnd();
		 b.getData( 90, 90);
		 b.Display();
		 f.data(92, 90);
		 f.Display();
	}

}
