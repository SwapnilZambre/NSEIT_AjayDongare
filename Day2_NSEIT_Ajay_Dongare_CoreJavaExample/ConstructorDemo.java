package nseit;

public class ConstructorDemo
{
	int length;
	int breadth;
	
	ConstructorDemo()
	{
		System.out.println("Default Constructor IS");	
		length=1;
		breadth=1;
	}
	
	ConstructorDemo(int l,int b)
	{
		System.out.println("Parameterised Constructor Is ");
		length=l;
		breadth=b;
	}
	
	
	public void calArea()
	{
		
		System.out.println("Area Of ConstructorDemo Is "+(length*breadth));
	}
	

}

