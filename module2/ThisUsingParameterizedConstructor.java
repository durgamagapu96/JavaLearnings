package module2;

public class ThisUsingParameterizedConstructor 
{
	String name;
	int id;
	String desg;
	
	public ThisUsingParameterizedConstructor(String name, int id, String desg)
	{
		this.name=name;
		this.id=id;
		this.desg=desg;
	}
	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("desg: "+desg);
	}
	public static void main(String[] args) 
	{
		ThisUsingParameterizedConstructor e1=new ThisUsingParameterizedConstructor("Durga", 1, "QA");
		ThisUsingParameterizedConstructor e2=new ThisUsingParameterizedConstructor("Kavya", 2, "Dev");
		System.out.println(e1.name+" "+e1.id+" "+e1.desg);
		e2.display();
	}

}
