package practice;

public class Panlindrome {

	public static void main(String[] args) 
	{
		int rev=0,rem,num=789,temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
		

}
