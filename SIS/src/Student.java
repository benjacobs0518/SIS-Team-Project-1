import java.io.File;
import java.util.*;
import java.util.Scanner;
import java.io.IOException;
public class Student
	{
		private String fName;
		private String lName;
		private String class1;
		private String grade1;
		private String class2;
		private String grade2;
		private String class3;
		private String grade3;
		private double GPA;
		
		public Student(String fn, String ln, String c1, String g1, String c2, String g2, String c3, String g3, double g)
			{
			fName=fn;
			lName=ln;
			class1=c1;
			grade1=g1;
			class2=c2;
			grade2=g2;
			class3=c3;
			grade3=g3;
			GPA=g;
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
	public double GPA()
		{
			return GPA;
		}
	public void setGPA(double GPA)
		{
			this.GPA = GPA;
		}
	
	}
