package practice;

public class Armstrong 
{

	public static void main(String[] args) 
	{
		int num=153,temp=num, rev=0,rem;
		while(num>0)
		{
			rem=num%10;
			rev=rev+(rem*rem*rem);
			num/=10;
		}
	if(temp==rev)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("Not Armstrong");
	}
	}
	

}
