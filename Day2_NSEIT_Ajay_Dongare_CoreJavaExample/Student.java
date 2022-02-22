package nseit;


public class Student {

	int rollno;
	String name;
	String branch;

	Student()
	{
		rollno=1;
		name="Ajju";
		branch="IT";
		System.out.println("Default Constructor");
	}
	
	Student(int rn,String n,String b)
	{
		this.rollno=rn;
		this.name=n;
		this.branch=b;
		System.out.println("Paramized Constructor");
		
	}
	void getData()
	{
		System.out.println("Inside The Getdata Method");
	}
	void printData()
	{
		System.out.println("Rollno: "+rollno+" "+"Name: "+name+" "+"Branch: "+branch);
	}
}

