import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent
	{
	static ArrayList<String> classNames = new ArrayList<String>();
	public static void main(String[] args) throws IOException
		{
		addStudent();
		}
	public static void addStudent()
		{
		classNames.add("Biology");
		classNames.add("English");
		classNames.add("Algebra");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please input student first name.");
		String addedFirst = userInput.nextLine();
		System.out.println("Please input student last name.");
		String addedLast = userInput.nextLine();
		System.out.println("the students name is " + addedFirst + " " + addedLast + ".");
		System.out.println("Please input (1) to select biology as the next period class, (2) to make english the next class, or (3) to make algebra the next class.");
		int classInput = userInput.nextInt();
		String newClass = classNames.get(classInput-1);
		System.out.println(newClass);
		classNames.remove(classInput-1);
		System.out.println("Please select the next class.");
		classInput = userInput.nextInt();
		
		}
	}
