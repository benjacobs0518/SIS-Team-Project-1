import java.util.*;
public class MainMenu
	{

	
	
		private static int menuChoice;
		private static int subMenuChoice;
		public static void displayMainMenu()
			{
			System.out.println("Would you like to:");
			System.out.println("    1) Add or delete a student");
			System.out.println("    2) Change student grades/schedule");
			System.out.println("    3) Sort students");
			Scanner userInput = new Scanner(System.in);
			int menuChoice=userInput.nextInt();
			switch(menuChoice)
				{
				case 1:
					showSubMenu1();
					break;
				case 2:
					showSubMenu2();
					break;
				case 3:
					showSubMenu3();
					break;
				default:
					System.out.println("Please enter a valid option (1,2,3)");
					displayMainMenu();
					break;
				}
			}
			public static void showSubMenu1()
				{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Would you like to:");
				System.out.println("     1) Add a student");
				System.out.println("     2) Remove a student");
				subMenuChoice = userInput.nextInt();
				if(subMenuChoice==1)
					AddStudent.addStudent();
				else if(subMenuChoice==2)
					AddStudent.deleteStudent();
				else
					{
					System.out.println("Please enter a valid option");
					showSubMenu1();
					}
			}
				
				
			public static void showSubMenu2()
				{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Would you like to:");
				System.out.println("     1) Change a grade");
				System.out.println("     2) Change a class");
				subMenuChoice = userInput.nextInt();
				if(subMenuChoice==1)
					ChangeStudentGradeAndClass.changeGrade();
				else if(subMenuChoice==2)
					ChangeStudentGradeAndClass.switchClass();
				else
					{
					System.out.println("Please enter a valid option");
					showSubMenu2();
					}
				}
			public static void showSubMenu3()
				{
				if (menuChoice==3)
					{
					}	
				else
					{
						System.out.println("Please restart and input a valid operator.");
					}
				}

	}
