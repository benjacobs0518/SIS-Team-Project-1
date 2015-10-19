import java.util.*;
public class MainMenu
	{

	
		static int menuChoice2 = 0;
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
						{
							System.out.println("What would you like to sort");
							System.out.println("    1) Sort by last name");
							System.out.println("    2) Sort by Period");
							System.out.println("    3) Sort by GPA");
							Scanner userInput1 = new Scanner(System.in);
							int menuChoice1=userInput1.nextInt();
							
							if (menuChoice1==1)
								{
							Collections.sort(Runner.students, new NameSorter());
							studentprofile();
								}
							
							if (menuChoice1==2)
								{
									
									System.out.println("What period would you like");
									System.out.println("    1) Period 1");
									System.out.println("    2) Period 2");
									System.out.println("    3) Period 3");
									
									Scanner userInput2 = new Scanner(System.in);
									menuChoice2 = userInput2.nextInt();
									
								Collections.sort(Runner.students, new SortClass());
								studentprofile();
								}
							
							if (menuChoice1==3)
								{
									Collections.sort(Runner.students, new SortGPA());
									studentprofile();
								}
						
						else
							{
								System.out.println("Please restart and input a valid operator.");
							}
						}
				
				}
			public static void studentprofile() 
				{
					
				
				for(int i = 0; i < Runner.students.size(); i++)
					{
						System.out.print(Runner.students.get(i).getfName() + " ");
						System.out.print(Runner.students.get(i).getlName() + " ");
						System.out.print(Runner.students.get(i).getClass1() + " ");
						System.out.print(Runner.students.get(i).getGrade1()+ " ");
						System.out.print(Runner.students.get(i).getClass2()+ " ");
						System.out.print(Runner.students.get(i).getGrade2()+ " ");
						System.out.print(Runner.students.get(i).getClass3()+ " ");
						System.out.print(Runner.students.get(i).getGrade3()+ " ");
						System.out.print(Runner.students.get(i).GPA()+ " ");
						System.out.println();
					}
				}

	}
