package module3;

class Employee
{
	String name="Durga";
	public void empName()
	{
		System.out.println("The name of th employee and is:");
	}
}

class EmployeeID extends Employee
{
	int id=41;
	public void empId()
	{
		empName();
		System.out.println(name+" "+id);
	}
}

public class SingleInheritance {

	public static void main(String[] args)
	{
		EmployeeID e1=new EmployeeID();
		e1.empId();

	}

}
