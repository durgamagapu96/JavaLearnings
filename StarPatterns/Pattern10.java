package StarPatterns;

public class Pattern10 {

	public static void main(String[] args) 
	{
		char print='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(print);
				print++;
			}
			System.out.println();
		}

	}

}
