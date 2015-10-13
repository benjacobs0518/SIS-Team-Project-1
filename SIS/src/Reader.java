import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Reader
	{

		
		private String fName;
		private String lName;
		private String class1;
		private String grade1;
		private String class2;
		private String grade2;
		private String class3;
		private String grade3;
		
		
		
		public Reader(String fn, String ln, String c1, String g1, String c2, String g2, String c3, String g3)
		{
			fn=fName;
			ln=lName;
			c1=class1;
			g1=grade1;
			c2=class2;
			g2=grade2;
			c3=class3;
			g3=grade3;
			
		}
		public String getfName()
			{
				return fName;
			}
		public void setfName(String fName)
			{
				this.fName = fName;
			}
		public String getlName()
			{
				return lName;
			}
		public void setlName(String lName)
			{
				this.lName = lName;
			}
		public String getClass1()
			{
				return class1;
			}
		public void setClass1(String class1)
			{
				this.class1 = class1;
			}
		public String getGrade1()
			{
				return grade1;
			}
		public void setGrade1(String grade1)
			{
				this.grade1 = grade1;
			}
		public String getClass2()
			{
				return class2;
			}
		public void setClass2(String class2)
			{
				this.class2 = class2;
			}
		public String getGrade2()
			{
				return grade2;
			}
		public void setGrade2(String grade2)
			{
				this.grade2 = grade2;
			}
		public String getClass3()
			{
				return class3;
			}
		public void setClass3(String class3)
			{
				this.class3 = class3;
			}
		public String getGrade3()
			{
				return grade3;
			}
		public void setGrade3(String grade3)
			{
				this.grade3 = grade3;
			}
		public static void reader() throws IOException
		{
		Scanner file = new Scanner(new File("studentlist3.txt"));
		while (file.hasNext())
			{
		fName=file.next();
		lName=file.next();
		class1=file.next();
		grade1=file.next();
		class2=file.next();
		grade2=file.next();
		class3=file.next();
		grade3=file.next();
		
		
			}
		file.close();
		}
		public static void main(String[] args) throws IOException
			{
			reader();
			
			}

	}
