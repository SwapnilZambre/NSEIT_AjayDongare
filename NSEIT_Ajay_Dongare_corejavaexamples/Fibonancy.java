package corejavaexamples;

public class Fibonancy
{
	public static void main(String[] args)
	{
		int n=5;
		int a=0;
		int b=1;
	
		System.out.println("Fibonancy Series is"+ n);

		for(int i=0;i<=n;i++)
		{
			System.out.println(a +" ");
	
			int result=a+b;
			a=b;
			b=result;
		}
		
	}
}
