package nseit;

public class Box3Demo extends Box2Demo
{
	int height;
	int length;
	Box3Demo()
	{
		height=1;
		length=5;
	}
	public void calVolume()
	{
		System.out.println("The volume is : "+(super.length*breadth*height));
	}
}
	

