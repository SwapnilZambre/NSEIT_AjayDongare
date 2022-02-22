package corejavaexamples;

import java.util.Scanner;

public class DistBetDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter a X1: ");
	      int X1 = sc.nextInt();
	      
	      System.out.print("Enter a Y1: ");
	      int Y1 = sc.nextInt();
	      
	      System.out.print("Enter a X2: ");
	      int X2 = sc.nextInt();
	      
	      System.out.print("Enter a Y2: ");
	      int Y2 = sc.nextInt();
	      
	      double distance=Math.sqrt((X1-X2)*(X1-X2)+(Y1-Y2)*(Y1-Y2));
	      
	      System.out.println("Distance Is "+ distance);
	}

}
