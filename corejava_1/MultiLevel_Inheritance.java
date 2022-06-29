package corejava_1;
class Fav
{
	public int maths=10,java=10,python=10,avg;
	void set(int math,int java,int python)
	{
		this.maths=maths;
		this.java=java;
		this.python=python;
	}
	int getData()
	{
	    avg=(maths+java+python)/3;
		return avg;
	}
}
class Subclass extends Fav
{
	void Display()
	{
		System.out.println("Avg : "+(avg));
	}
}
public class MultiLevel_Inheritance extends Subclass{

	public static void main(String[] args) {
		 MultiLevel_Inheritance obj=new MultiLevel_Inheritance();
		 obj.set(98, 90, 90);
		 obj.getData();
		 obj.Display();
	}
}
