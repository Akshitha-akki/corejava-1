package corejava_1;
import java.util.*;
import java.util.Scanner;
class Students
{
	String name;
	int Roll_no;
	Students(String name,int Roll_no)
	{
		this.name=name;
		this.Roll_no=Roll_no;
	}
	public Students(Students stud) {
		this.name=stud.name;
		this.Roll_no=stud.Roll_no;
	}
	void displayStudentDetails()
	{
		System.out.println("Name : "+ this.name+"\nRoll_no : "+this.Roll_no);
	}
}

public class Copy_Constructor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name and roll_no : ");
		String name =scan.nextLine();
		int Roll_no=scan.nextInt();
		Students s=new Students(name,Roll_no);
		//Copy Constructor
		s.displayStudentDetails();
		System.out.println("Copy :");
		Students  copy=new Students(s);
		copy.displayStudentDetails();
	}

}
