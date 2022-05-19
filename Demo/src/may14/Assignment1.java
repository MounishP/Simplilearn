package may14;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		System.out.print("Enter Designation: ");
		String designation = sc.next();
		
		System.out.println("ID: "+id+" Name: "+name+" Age: "+age+" Salary: "+salary+" Designation: "+designation);
	}

}
