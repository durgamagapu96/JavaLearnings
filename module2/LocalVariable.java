package module2;

public class LocalVariable 
{
	 public static void displaydetails()
	 {
	String ename="Durga";
	int eid=41;
	String desg="QA";
	System.out.println("Employee name: "+ename);
	System.out.println("Employee is : "+eid);
	System.out.println("Designation : "+desg);
	 }
	 
	 public static void main(String args[])
	 {
	displaydetails();
	String ename="Prasanna";
	int eid=42;
	String desg="SAP";
	System.out.println("Employee name: "+ename);
	System.out.println("Employee is : "+eid);
	System.out.println("Designation : "+desg); 
	 }

}

