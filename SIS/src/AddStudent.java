import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent
	{
	static String grade1Input;
	static String grade2Input;
	static String grade3Input;
	static int period1Input;
	static int period2Input;
	static int period3Input;
	static Scanner userInput = new Scanner(System.in);
	static Scanner userInput1 = new Scanner(System.in);

	static ArrayList<String> classNames = new ArrayList<String>();
	public static void main(String[] args)
		{
		addStudent();
		deleteStudent();
		}
	public static void addStudent()
		{
		classNames.add("Biology");
		classNames.add("English");
		classNames.add("Algebra");
		System.out.println("Please input student first name.");
		String addedFirst = userInput.nextLine();
		System.out.println("Please input student last name.");
		String addedLast = userInput.nextLine();
		System.out.println("Please input (1) to select biology, (2) to select english, or (3) to select algebra.");
		period1Input = userInput.nextInt();
		checkGrade1();
		System.out.println("Please select the next class.");
		period2Input = userInput.nextInt();
		checkGrade2();
		System.out.println("Please select the next class.");
		period3Input = userInput.nextInt();
		checkGrade3();
		System.out.println("Input the students GPA.");
		double inputGPA = userInput.nextDouble();
		Runner.students.add(new Student(addedFirst, addedLast, classNames.get(period1Input-1), grade1Input, classNames.get(period2Input-1), grade2Input, classNames.get(period3Input-1), grade3Input, inputGPA));
		System.out.println("Student added, taking you back to the main menu");
		MainMenu.displayMainMenu();
		}
	public static void checkGrade1()
		{
		System.out.println("Input the grade for " + classNames.get(period1Input-1));
		grade1Input = userInput1.nextLine();
		grade1Input = grade1Input.toUpperCase();
		if(grade1Input.length()>2)
			{
			System.out.println("Grade too long, change it to 2 or less letters or spaces");
			checkGrade1();
			}
		}
	public static void checkGrade2()
		{
		System.out.println("Input the grade for " + classNames.get(period2Input-1));
		grade2Input = userInput1.nextLine();
		grade2Input = grade2Input.toUpperCase();
		if(grade2Input.length()>2)
			{
			System.out.println("Grade too long, change it to 2 or less letters or spaces");
			checkGrade2();
			}
		}
	public static void checkGrade3()
		{
		System.out.println("Input the grade for " + classNames.get(period3Input-1));
		grade3Input = userInput1.nextLine();
		grade3Input = grade3Input.toUpperCase();
		if(grade3Input.length()>2)
			{
			System.out.println("Grade too long, change it to 2 or less letters or spaces");
			checkGrade3();
			}
			}
	public static void deleteStudent()
		{
		int counter = Runner.students.size()-1;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Based on a numerical value (from 0 to "+counter+"), please select the number of the student you'd like to delete.");
		int deletedStudent = userInput.nextInt();
		System.out.println("You are deleting: " + Runner.students.get(deletedStudent-1).getfName());
		Runner.students.remove(deletedStudent-1);
		System.out.println("Deletion complete, taking you back to the main menu");
		MainMenu.displayMainMenu();
		}
	}

