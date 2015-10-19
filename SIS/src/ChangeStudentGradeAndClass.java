import java.util.*;
public class ChangeStudentGradeAndClass 
{
	private static int personChoice;
	private static String newGrade;
	private static int classChoice;
	private static int secondClassChoice;
	private static String tempClass;
	public static void changeGrade()
		{
		printStudentsNames();
		System.out.println();
		System.out.println("Whose grade would you like to change?");
		System.out.println();
		Scanner userInput = new Scanner(System.in);
		personChoice = userInput.nextInt()-1;
		if(personChoice>Runner.students.size()||personChoice<0)
			{
			System.out.println("Not a valid student, please start from the beginning");
			changeGrade();
			}
		System.out.println("Currently modifying "+Runner.students.get(personChoice).getfName());
		System.out.println("Choose a class to change its grade");
		printStudentClasses();
		System.out.println("Select a class");
		System.out.println();
		classChoice = userInput.nextInt()-1;
		if(classChoice>3||classChoice<1)
			{
			System.out.println("Not a valid class, please start from the ");
			}
		verifyNewGrade();
		if(classChoice==0)
			{
			Runner.students.get(personChoice).setGrade1(newGrade);
			System.out.println("New grade for "+Runner.students.get(personChoice).getfName()+" is "+Runner.students.get(personChoice).getGrade1());
			}
		if(classChoice==1)
			{
			Runner.students.get(personChoice).setGrade2(newGrade);
			System.out.println("New grade for "+Runner.students.get(personChoice).getfName()+" is "+Runner.students.get(personChoice).getGrade2());
			}
		if(classChoice==2)
			{
			Runner.students.get(personChoice).setGrade3(newGrade);		
			System.out.println("New grade for "+Runner.students.get(personChoice).getfName()+" is "+Runner.students.get(personChoice).getGrade3());
			}
		
		runOrReturnGrades();
		}
	public static void switchClass()
		{
		printStudentsNames();
		System.out.println();
		System.out.println("Whose schedule would you like to change?");
		System.out.println();
		Scanner userInput = new Scanner(System.in);
		personChoice = userInput.nextInt()-1;
		printStudentClassesNoGrades();
		verifyNewClass();
		printStudentClassesNoGrades();
		runOrReturnSchedule();
		}
		
	public static void printStudentsNames()
		{
		int counter=1;
		for(Object fred:Runner.students)
			{
			System.out.println(counter+") "+Runner.students.get(counter-1).getfName()+" "+Runner.students.get(counter-1).getlName());
			counter++;

			}
		}
	public static void printStudentClasses()
		{
		System.out.println();
		System.out.println("1) "+Runner.students.get(personChoice).getClass1() +": "+ Runner.students.get(personChoice).getGrade1());
		System.out.println("2) "+Runner.students.get(personChoice).getClass2() +": "+ Runner.students.get(personChoice).getGrade2());
		System.out.println("3) "+Runner.students.get(personChoice).getClass3() +": "+ Runner.students.get(personChoice).getGrade3());
		System.out.println();
		}
	public static void printStudentClassesNoGrades()
		{
		System.out.println();
		System.out.println("1) "+Runner.students.get(personChoice).getClass1());
		System.out.println("2) "+Runner.students.get(personChoice).getClass2());
		System.out.println("3) "+Runner.students.get(personChoice).getClass3());
		System.out.println();	
		}
	public static void runOrReturnGrades()
		{
		System.out.println("Would you like to change any more grades?(Y/N)");
		Scanner userInput2 = new Scanner(System.in);
		String userAnswer = userInput2.nextLine();
		if(userAnswer.equals("y")||userAnswer.equals("Y"))
			{
			changeGrade();
			}
		else if(userAnswer.equals("n")||userAnswer.equals("N"))
			{
			System.out.println("Taking you back to the main menu");
			System.out.println("");
			MainMenu.displayMainMenu();
			}
		else
			{
			System.out.println("Sorry, answer not recognized, try again");
			runOrReturnGrades();
			}
		}
	public static void runOrReturnSchedule()
		{
		System.out.println("Would you like to change any more schedules?(Y/N)");
		Scanner userInput2 = new Scanner(System.in);
		String userAnswer = userInput2.nextLine();
		if(userAnswer.equals("y")||userAnswer.equals("Y"))
			{
			changeGrade();
			}
		else if(userAnswer.equals("n")||userAnswer.equals("N"))
			{
			System.out.println("Taking you back to the main menu");
			System.out.println("");
			MainMenu.displayMainMenu();
			}
		else
			{
			System.out.println("Sorry, answer not recognized, try again");
			runOrReturnSchedule();
			}
		}
	public static void verifyNewGrade()
		{
		System.out.println();
		System.out.println("What would you like the new grade to be? Input the new grade in a single line, Ex: 'A+'");
		Scanner userInput1 = new Scanner(System.in);
		newGrade = userInput1.nextLine();
		newGrade = newGrade.toUpperCase();
		if(newGrade.length()>2)
			{
			System.out.println("Grade too long, change it to 2 or less letters or spaces");
			verifyNewGrade();
			}
		}
	public static void verifyNewClass()
		{
		System.out.println("Currently modifying "+Runner.students.get(personChoice).getfName());
		System.out.println("Choose a class and then another class to switch them");
		Scanner userInput = new Scanner(System.in);
		classChoice = userInput.nextInt()-1;
		
		if(classChoice>3||classChoice<1)
			{
			System.out.println("Invalid choice, try again");
			verifyNewClass();
			}
		System.out.println("Now select the second class");
		if(classChoice==1)
			{
			tempClass = Runner.students.get(personChoice).getClass1();
			System.out.println("Selected class: "+Runner.students.get(personChoice).getClass1());
			System.out.println();
			System.out.println("1) [CURRENTLY SELECTED]");
			System.out.println("2) "+Runner.students.get(personChoice).getClass2() +": "+ Runner.students.get(personChoice).getGrade2());
			System.out.println("3) "+Runner.students.get(personChoice).getClass3() +": "+ Runner.students.get(personChoice).getGrade3());
			}
		if(classChoice==2)
			{
			tempClass = Runner.students.get(personChoice).getClass2();
			System.out.println("Selected class: "+Runner.students.get(personChoice).getClass2());
			System.out.println();
			System.out.println("1) "+Runner.students.get(personChoice).getClass1() +": "+ Runner.students.get(personChoice).getGrade1());
			System.out.println("2) [CURRENTLY SELECTED]");
			System.out.println("3) "+Runner.students.get(personChoice).getClass3() +": "+ Runner.students.get(personChoice).getGrade3());
			}
		if(classChoice==3)
			{
			tempClass = Runner.students.get(personChoice).getClass3();
			System.out.println("Selected class: "+Runner.students.get(personChoice).getClass3());
			System.out.println();
			System.out.println("1) "+Runner.students.get(personChoice).getClass1() +": "+ Runner.students.get(personChoice).getGrade1());
			System.out.println("2) "+Runner.students.get(personChoice).getClass2() +": "+ Runner.students.get(personChoice).getGrade2());
			System.out.println("3) [CURRENTLY SELECTED]");
			}
		System.out.println();
		secondClassChoice=userInput.nextInt();
		if(secondClassChoice==classChoice)
			{
			System.out.println("The same classes were picked, no changes were made");
			}
		else
			{
			if(secondClassChoice==1)
				{
					
				Runner.students.get(personChoice).setClass1(tempClass);
				}
			if(secondClassChoice==2)
				{
				Runner.students.get(personChoice).setClass2(tempClass);
				}
			if(secondClassChoice==3)
				{
				Runner.students.get(personChoice).setClass3(tempClass);
				}
			}
		}










}

