package corejavaexamples;

import java.util.Scanner;

public class FibonancyDemo5 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		
		System.out.println(sumOfFib(n));
	}
		 
		public static int sumOfFib(int n)
		{
			int a = 0, b = 1, c = 0, d = 0;
			for (int i = 3; i <= n; i++) 
			{
				c = a + b;
				b = c;
				a = b;
				d = d + c;
			}
		return d;
		}
}