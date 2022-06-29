package corejava_1;

class bike {
	final void run()
	{
		System.out.println("Bike");
	}
}
class Final extends bike{
	public static void main(String[] args) {
		 Final obj=new Final();
		 obj.run();
	}
}
