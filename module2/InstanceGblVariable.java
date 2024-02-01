package module2;

public class InstanceGblVariable 
{
	 static String employee="Kavya";
	 static String cname="Tech Mahindra";
	 static long phn=807445536;
	 static String role="QA";
	 static String brname="Hyderabad";
	 
	 public static void displayDetails()
	 {
	String employee="Durga";//local var
	long phn=888688841;//local var
	System.out.println("Employee Name : "+employee);//Rohan
	System.out.println("Phn Number : "+phn);//2465656553
	System.out.println("Role : "+role);//IOBA127500
	System.out.println("Branch name : "+brname);//Hyderabad
	 }
	 public static void main(String args[])
	 {
	String cName="Cognine";//local var
	System.out.println("---Details of Employee From---"+cName);//ICICI
	 displayDetails();
	 }
	} 