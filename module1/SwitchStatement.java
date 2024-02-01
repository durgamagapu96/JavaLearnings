package module1;

public class SwitchStatement {

	public static void main(String[] args)
	{
		String Status="Done";
		switch(Status)
		{
		case "To Do":
			System.out.println("Need to start the tasks");
			break;
			
		case  "In Progress":
			System.out.println("Complete the tasks on time");
			break;
		
		case "Done":
			System.out.println("Close the sprint");
			break;
		default:
			System.out.println("Invalid Status");
			break;
			
		}
	}

}
