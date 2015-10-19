import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent
	{
	static ArrayList<String> classNames = new ArrayList<String>();
	static ArrayList<String> classNamesEditted = new ArrayList<String>();
	public static void main(String[] args) throws IOException
		{
			Runner.reader();
		//addStudent();
		deleteStudent();
		}
	public static void addStudent()
		{
		classNames.add("Biology");
		classNames.add("English");
		classNames.add("Algebra");
		Scanner userInput = new Scanner(System.in);
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Please input student first name.");
		String addedFirst = userInput.nextLine();
		System.out.println("Please input student last name.");
		String addedLast = userInput.nextLine();
		System.out.println("Please input (1) to select biology, (2) to select english, or (3) to select algebra.");
		int period1Input = userInput.nextInt();
		System.out.println("Input the grade for this class.");
		String grade1Input = userInput1.nextLine();
		System.out.println("Please select the next class.");
		int period2Input = userInput.nextInt();
		System.out.println("Input the grade for this class.");
		String grade2Input = userInput1.nextLine();
		System.out.println("Please select the next class.");
		int period3Input = userInput.nextInt();
		System.out.println("Please put in a grade for " + classNames.get(period3Input - 1));
		String grade3Input = userInput1.nextLine();
		System.out.println("Input the students GPA.");
		double inputGPA = userInput.nextDouble();
		Runner.students.add(new Student(addedFirst, addedLast, classNames.get(period1Input-1), grade1Input, classNames.get(period2Input-1), grade2Input, classNames.get(period3Input-1), grade3Input, inputGPA));
		}
	public static void deleteStudent()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Based on a numerical value (up to 24), please select the number of the student you'd like to delete.");
		int deletedStudent = userInput.nextInt();
		System.out.println("You are deleting: " + Runner.students.get(deletedStudent-1).getfName());
		Runner.students.remove(deletedStudent-1);
		}
	}
























