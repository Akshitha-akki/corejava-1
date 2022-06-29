package corejava_1;
import java.util.*;
class StudentsDetails
{
	String name;
	int Roll_no;
	
	//Default
	StudentsDetails() 
	{
       //Static
		name ="Akshitha";
		Roll_no=36;
	//Dynamic
	 /*	Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name and roll_no : ");
		name =scan.nextLine();
		Roll_no=scan.nextInt();
	*/
		System.out.println("Name : "+name+"\nRoll_no : "+Roll_no);
	}
	//Parameterized constructor
	StudentsDetails(String name,int Roll_no)
	{
		//this.name=name;
		this.Roll_no=Roll_no;
		System.out.println("Parameterized constructor");
	}
	
}
public class ConstructorForStudentDetails {

	public static void main(String[] args) {
		//Default
		//StudentsDetails s=new StudentsDetails();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name and roll_no : ");
		String name =scan.nextLine();
		int Roll_no=scan.nextInt();
		StudentsDetails s=new StudentsDetails(name,Roll_no);
		System.out.println("Name : "+s.name+"\nRoll_no : "+s.Roll_no);
		
	}

}
