import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner 
	{
	static ArrayList<Student> students = new ArrayList<Student>();
	public static void main(String[] args) throws IOException
		{
		reader();
		MainMenu.displayMainMenu();
		
		}
	public static void reader() throws IOException
		{
		Scanner file = new Scanner(new File("studentlist3.txt"));
		while (file.hasNext())
			{
			String fName=file.next();
			String lName=file.next();
			String class1=file.next();
			String grade1=file.next();
			String class2=file.next();
			String grade2=file.next();
			String class3=file.next();
			String grade3=file.next();
			double GPA=0;
			students.add(new Student(fName, lName, class1, grade1, class2, grade2, class3, grade3, GPA));
	
		}
	}

}
