package corejava_1;
class Subjects
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
	void Display()
	{
		System.out.println("Avg : "+(avg));
	}
}

class Single_Inheritance extends Subjects
{	
	public static void main(String[] agrs)
	{
		Single_Inheritance obj =new Single_Inheritance();
		obj.set(98, 90, 90);
		obj.getData();
		obj.Display();
	}
}
