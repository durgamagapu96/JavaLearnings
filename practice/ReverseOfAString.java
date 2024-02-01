package practice;

public class ReverseOfAString {

	public static void main(String[] args)
	{
		String name="Durga";
		String rev="";
		char ch;
		
		for (int i=0; i<name.length();i++)
		{
			ch=name.charAt(i);
			rev=ch+rev;
		}
		
        System.out.println(rev);
	}

}
