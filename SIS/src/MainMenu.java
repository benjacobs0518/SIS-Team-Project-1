import java.util.*;
public class MainMenu
	{

	
	
	
	
		public static void mainMenu()
			{
			System.out.println("What would you like to do?");
			System.out.println("    1) Add or delete a student");
			System.out.println("    2) Change student grades/schedule");
			System.out.println("    3) Sort students");
			Scanner userInput = new Scanner(System.in);
			String in=userInput.nextLine();
			if (in.equals("1"))
				{
					//go to menu for adding and deleting a student
				}
			if (in.equals("2"))
				{
					//go to menu for student grades/schedule
				}
			if (in.equals("3"))
				{
					//go to menu for sorting students
				}
			else
				{
					System.out.println("Please restart and input a valid operator.");
				}
			}

	}
