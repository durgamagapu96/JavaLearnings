package StarPatterns;

public class Pattern18 {

	public static void main(String[] args) 
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<7/2;j++)
			{
				if(i<=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=7/2;k<=0;k--)
			{
				if(k>=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
