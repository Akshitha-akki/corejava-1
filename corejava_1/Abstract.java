package corejava_1;

abstract class myclass
{
	abstract void display(int l,int w);
}
class Area extends myclass
{
	void display(int l,int w)
	{
		System.out.println("Area of Rectangle : "+(l*w));
	}
}
class Parimerter extends myclass
{
    void display(int l,int w)
    {
	     	System.out.println("Perimeter of Rectangle : "+(2*(l+w)));	     	
    }
}
public class Abstract {

	public static void main(String[] args) {
		Area a1=new Area();
		a1.display(2, 2);
		Parimerter p1=new Parimerter();
		p1.display(2, 2);
		myclass m1;
		m1=a1;
		a1.display(1, 1);
	}

}
