package module2;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		add();
		add(50, 60);
		add("Durga", 42);
		add("Kavya", "Prasanna");
		
	
	}
	public static void add()
	{
		System.out.println(10+20);
	}
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void add(String a, String b)
	{
		
		System.out.println(a+" "+b);
	}
	public static void add(String a, int b)
	{
			System.out.println("Name is:"+a+" ID is: "+b);
	}
}
