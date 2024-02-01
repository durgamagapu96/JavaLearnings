package module2;

public class ParameterizedConstructor
{	
	String name;
	int id;
	public ParameterizedConstructor(String ename,int eid) 
	{
		name=ename;
		id=eid;		
	}
	public void displayEmpDetails()
	{
		System.out.println("name "+name);
		System.out.println("id "+id);
	}
	public static void main(String[] args) 
	{
		ParameterizedConstructor e1=new ParameterizedConstructor("Durga", 2);
		ParameterizedConstructor e2=new ParameterizedConstructor("Kavya", 3);
		e1.displayEmpDetails();
		e2.displayEmpDetails();

}
}
