package corejava_1;

import java.util.*;

class Student {
	String name;
	int roll_no;

	void display(String n, int r) {
		this.name = n;
		this.roll_no = r;
		System.out.println("Name : " + n + " \n" + "Roll_no : " + r);
	}
	
}

public class DetailsOfStudents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = scan.nextLine();
		System.out.println("Enter the Roll_no :");
		int roll_no = scan.nextInt();
		Student s = new Student();
		s.display(name, roll_no);
	}

}
