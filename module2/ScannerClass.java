package module2;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) 
	{
		System.out.println("Details of Employee");
		empDetails();       
	}
	public static void empDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Emploee name: ");
		String name=s.nextLine();
		System.out.println("Employee ID: ");
		int id=s.nextInt();
		System.out.println("Is Billable: ");
		Boolean billable=s.nextBoolean();
		System.out.println("Phone: ");
        long phn=s.nextLong();
        System.out.println("Salary: ");
        double sal=s.nextDouble();
        System.out.println("Gender: ");
        char gender=s.next().charAt(0);
        
        System.out.println("Print the Details");
        System.out.println("Name of the Employee: "+name);
        System.out.println("Id of the Employee: "+id);
        System.out.println("Is Employee Billable: "+billable);
        System.out.println("Contact number of the employee: "+phn);
        System.out.println("Salary of the employee: "+sal);
        System.out.println("Gender: "+gender);
	}

}
