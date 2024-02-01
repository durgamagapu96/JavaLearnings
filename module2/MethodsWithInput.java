package module2;

public class MethodsWithInput {

	public static void main(String[] args) {
		 employee("Durga","durga.magapu@cognine.com",9845915746l);
	 }
	//static method without specific returntype and with arguments
	 public static void employee(String name,String email,long contact)
	 {
	 System.out.println("Name :"+name);
	 System.out.println("Email address:"+email);
	 System.out.println("Contact details: "+contact); 
	 }
	 
}
