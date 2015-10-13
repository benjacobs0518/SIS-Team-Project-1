import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LastName1
	{

		
		public static void main(String[] args) throws IOException

			{
				sortName();
			}
		
		public static void sortName() throws IOException
			{
				Scanner file = new Scanner(new File("studentlist3.txt"));
				//lname
				ArrayList<String> student = new ArrayList<String>();
				
				
				while (file.hasNext())
					{
						student.add(file.nextLine());
						
					}
			
			for (int i = 0; i < student.size(); i++)
				{
					System.out.println(student.get(i));
				}
				
			}
	}