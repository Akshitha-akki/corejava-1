package corejava_1;
//private class Ab

 
public class AccessSpecifiers_private 
{
	
		private int a=10;
		private void display() {
			System.out.println("Hello \n"+a);
		}
	public static void main(String[] args) 
	{
   AccessSpecifiers_private obj = new AccessSpecifiers_private();
	obj.display();
}
}