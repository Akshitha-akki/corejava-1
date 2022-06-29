package corejava_1;
class Parent1
	{
		public String s = "Srinivas";
		void Display()
		{
			 System.out.println(s);
		}
	}
	class Child1 extends Parent1
	{
		@Override
		void Display()
		{
			super.Display();
			System.out.println("AKshitha");
		}
	}
	public class Override1 {

 		public static void main(String[] args) {
			 Child1 obj=new Child1();
			 obj.Display();
		}

	}

