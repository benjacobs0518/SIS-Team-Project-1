import java.util.*;
public class ChangeStudentGradeAndClass 
{
	private static int personChoice;
	public static void main(String[] args) 
		{
		
		
		changeGrade();
		
		}
	public static void changeGrade()
		{
		printStudentsNames();
		System.out.println();
		System.out.println("Whose grade would you like to change?");
		System.out.println();
		Scanner userInput = new Scanner(System.in);
		personChoice = userInput.nextInt()-1;
		printStudentClasses();
		System.out.println();
		System.out.println("Select a class");
		System.out.println();
		int classChoice = userInput.nextInt()-1;
		if(classChoice==0)
			System.out.println("Student grade for "+Runner.students.get(personChoice).getfName()+" is: "+Runner.students.get(personChoice).getClass1());
		if(classChoice==1)
			System.out.println("Student grade for "+Runner.students.get(personChoice).getfName()+" is: "+Runner.students.get(personChoice).getClass2());
		if(classChoice==2)
			System.out.println("Student grade for "+Runner.students.get(personChoice).getfName()+" is: "+Runner.students.get(personChoice).getClass3());
		System.out.println("What would you like the new grade to be? Input the new grade in a single line, Ex: 'A+'");
		String newGrade = userInput.nextLine();
		
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
		}
	public static void switchClass()
		{
		printStudentsNames();
		System.out.println("Whose schedule would you like to change?");
		Scanner userInput = new Scanner(System.in);
		personChoice = userInput.nextInt()-1;
		
		
		}
	public static void printStudentsNames()
		{
		int counter=1;
		for(Object fred:Runner.students)
			{
			System.out.println(counter+") "+Runner.students.get(personChoice).getfName()+" "+Runner.students.get(personChoice).getlName());
			}
		}
	public static void printStudentClasses()
		{
		int counter=1;
		System.out.println("1) "+Runner.students.get(personChoice).getClass1());
		System.out.println("2) "+Runner.students.get(personChoice).getClass2());
		System.out.println("3) "+Runner.students.get(personChoice).getClass3());

		}
	






















}

