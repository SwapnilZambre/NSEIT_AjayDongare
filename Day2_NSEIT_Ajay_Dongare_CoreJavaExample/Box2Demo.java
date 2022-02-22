package nseit;

public class Box2Demo
{
	int length;
	int breadth;
	Box2Demo()
	{
		length=1;
		breadth=1;
	}
	
	Box2Demo(int length, int breadth)
	{
		int area;
		this.length=length;
		this.breadth=breadth;
	}
	public void calArea() {
		
		//length=10;
		System.out.println("Area Of Box2Demo Is : "+(length*breadth));
	}
}
