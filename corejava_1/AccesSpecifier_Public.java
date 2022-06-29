package corejava_1;

class AccesSpecifier_Public
{
	public int v=4;
	public void display()
	{
		System.out.println("Public");
	}
	public static void main(String[] args)
	{
		AccesSpecifier_Public obj = new AccesSpecifier_Public();
		System.out.println(obj.v);
		obj.display();
	}
}
