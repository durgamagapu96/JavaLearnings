package StarPatterns;

public class Pattern16 {

	public static void main(String args[ ])
	{
		int row=4, column=7 ;
		for(int i=1;i<=row;i++) 
		{
			for(int j=1;j<=column;j++) 
			{
				if(i<=j)
				{ 
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(); 
		}
		
	}}