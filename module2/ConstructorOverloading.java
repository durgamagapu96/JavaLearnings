package module2;

public class ConstructorOverloading 
{
	String name;
	int id;
	String desg;
	String email;
	long phn;
	String address;
	String billable;
	String city;
	int pincode;
	public ConstructorOverloading(String name,int id)
	{
		this.name=name;
		this.id=id;		
		
	}
	
	public ConstructorOverloading(String desg, String email)
	{
		this.desg=desg;
		this.email=email;
	}
	
	public ConstructorOverloading(String address, String city, int pincode)
	{
		this.address=address;
		this.city=city;
		this.pincode=pincode;
	}
	
	public ConstructorOverloading(long phn, String billable)
	{
		this.phn=phn;
		this.billable=billable;
	}
	
	public void display()
	{
		System.out.println("name: "+ name);
		System.out.println("id: "+id);
	}


	public static void main(String[] args) 
	{
		ConstructorOverloading details=new ConstructorOverloading("Durga", 41);
		ConstructorOverloading address=new ConstructorOverloading("Madhapur", "Hyd", 500018);
		ConstructorOverloading desgnation=new ConstructorOverloading("QA", "Durga.magapu@cognine.com");
		ConstructorOverloading projectdetails=new ConstructorOverloading(971076389, "yes");
		details.display();
		System.out.println("adress: "+address.address+" city:"+address.city+ " pincode:"+address.pincode);
		System.out.println(desgnation.desg+" "+desgnation.email);
		System.out.println(projectdetails.phn+" "+projectdetails.billable);
		
	}

}
