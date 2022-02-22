package nseit;

class OverloadingExamDemo
{
	public void test(int a,int b)
	{
		System.out.println("Inside two int Varaible Method");
	}
	public void test(int a)
	{
		System.out.println("Inside one int Varaible Method");
	}
	public void test(int a,int b,int c)
	{
		System.out.println("Inside three int Varaible Method");
	}
	public void test(int x,char ch)
	{
		System.out.println("Inside one int and one char Varaible Method");
	}
}

public class OverloadingDemo 
{

	public static void main(String[] args)
	{
		OverloadingExamDemo d1=new OverloadingExamDemo();
		d1.test(10);
		d1.test(10,20);
		d1.test(10,20,30);
		d1.test(10,'A');
		
		


	}

}

