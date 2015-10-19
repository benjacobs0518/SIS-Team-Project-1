import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class SortClass implements Comparator<Student>
	{

		public int compare(Student arg0, Student arg1)
			{
				if (MainMenu.menuChoice2 == 1) return arg0.getClass1().compareTo(arg1.getClass1());
				else if (MainMenu.menuChoice2 == 2) return arg0.getClass2().compareTo(arg1.getClass2());
				else return arg0.getClass3().compareTo(arg1.getClass3());
				}
		
	
	}