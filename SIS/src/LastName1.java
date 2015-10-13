import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LastName1 implements Comparator<Student>
	{
		
		

		public int compare1(Student arg0, Student arg1)
		{
			
		
				 @Override
				     public int compare(Student o1, Student o2) {
				
				         String name1 = o1.getlName();
				
				         String name2 = o2.getlName();
				 
				  
				 
				         // ascending order (descending order would be: name2.compareTo(name1))
				 
				         return name1.compareTo(name2);

			}
	}
	