package practice;

public class ConcatAndReverse {

	public static void main(String[] args) 
	{
		String Fname="Durga";
		String Lname="Magapu";
		
		String Fullname=Fname+Lname;
		StringBuffer reverse=new StringBuffer(Fullname);
		reverse.reverse();
		System.out.println(reverse);
		

	}

}
