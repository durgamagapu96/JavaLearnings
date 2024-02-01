package module2;

public class StaticVsNonStatic {
	int empID=41;
	String address="Hyderabad";
	public void empName()
	{
		String name="Durga";
		System.out.println("Employee name is: " +name);
		address();
	}
	public void empID()
	{
		System.out.println("Employee ID is: "+empID);
	}
	public void empRole()
	{   
		String empRole="QA";
		System.out.println("Employee Role is: "+empRole);
	}
     
	public static void address()
	   { 
		
		StaticVsNonStatic add=new StaticVsNonStatic();
		add.empRole();
		 System.out.println("Employee address is: "+add.address);
		}
	
	public static void main(String[] args)
	{
	StaticVsNonStatic RetriveDetails=new StaticVsNonStatic();
	RetriveDetails.empName();
	RetriveDetails.empID();
	}
		

	}


