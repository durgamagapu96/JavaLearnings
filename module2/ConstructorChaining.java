package module2;
class ConstructorChaining
{
	public ConstructorChaining()
	{
		this(100,200);
		System.out.println("Its a default constructor");
	}
	
	public ConstructorChaining(int a,int b)
	{
		System.out.println(a+b);
	}
public static void main(String [] args)	
{
	ConstructorChaining c1=new ConstructorChaining();
}
}