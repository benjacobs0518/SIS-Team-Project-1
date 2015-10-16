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
			int menuChoice=userInput.nextInt();
			if (menuChoice==1)
				{
					System.out.println("You'd you like to:");
					System.out.println("     1) Change a grade");
					System.out.println("     2) Change a class");
					
					int subMenuChoice = userInput.nextInt();
				}
			if (menuChoice==2)
				{
					//go to menu for student grades/schedule
				}
			if (menuChoice==3)
				{
					//go to menu for sorting students
				}
			else
				{
					System.out.println("Please restart and input a valid operator.");
				}
			}

	}
