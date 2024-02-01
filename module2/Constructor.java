package module2;

public class Constructor 
{
	String name;
	public Constructor()
	{
	 name="Durga";
	}

	public static void main(String[] args)
	{
		Constructor E1=new Constructor();
		System.out.println(E1.name);
		Constructor E2=new Constructor();
		System.out.println(E2.name);

	}

}
