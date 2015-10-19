import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class SortGPA implements Comparator<Student>
	{

		public int compare(Student arg0, Student arg1)
			{
				 return arg0.getGPA().compareTo(arg1.getGPA());
				}
		
	}