import java.util.*;
public class ChangeStudentGrade 
{
	private static int personChoice;
	public static void main(String[] args) 
		{
		

		}
	public static void changeGrade()
		{
		printStudents();
		System.out.println("Whose grade would you like to change?");
		Scanner userInput = new Scanner(System.in);
		personChoice = userInput.nextInt()-1;
		System.out.println("");
		System.out.println("Select a class");
		printStudentClasses();
		int classChoice = userInput.nextInt()-1;
		if(classChoice==0)
			System.out.println("Student grade for "+Student.students.get(personChoice).getfName()+" is: "+Student.students.get(personChoice).getClass1());
		if(classChoice==1)
			System.out.println("Student grade for "+Student.students.get(personChoice).getfName()+" is: "+Student.students.get(personChoice).getClass2());
		if(classChoice==2)
			System.out.println("Student grade for "+Student.students.get(personChoice).getfName()+" is: "+Student.students.get(personChoice).getClass3());
		
		System.out.println("What would you like the new grade to be? Input the new grade in a single line, Ex: 'A+'");
		String newGrade = userInput.nextLine();
		
		if(classChoice==0)
			Student.students.get(personChoice).setClass1(newGrade);
		if(classChoice==1)
			
		if(classChoice==2)
		
		}
	public static void switchClass()
		{
		printStudents();
		System.out.println("Whose schedule would you like to change?");
		Scanner userInput = new Scanner(System.in);
		personChoice = userInput.nextInt()-1;
		
		
		}
	public static void printStudents()
		{
		int counter=1;
		for(Object fred:Student.students)
			{
			System.out.println(counter+") "+Student.students.get(personChoice).getfName()+" "+Student.students.get(personChoice).getlName());
			}
		}
	public static void printStudentClasses()
		{
		int counter=1;
		System.out.println("1)"+Student.students.get(personChoice).getClass1());
		System.out.println("2)"+Student.students.get(personChoice).getClass2());
		System.out.println("3)"+Student.students.get(personChoice).getClass3());

		}
	






















}

