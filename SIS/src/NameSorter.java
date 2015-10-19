import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class NameSorter implements Comparator<Student>
	{
		
		

		public int compare(Student arg0, Student arg1)
			{
				 return arg0.getlName().compareTo(arg1.getlName());
				}
		
	}
	