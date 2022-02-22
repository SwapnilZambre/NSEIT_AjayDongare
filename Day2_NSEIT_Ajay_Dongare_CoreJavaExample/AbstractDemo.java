package nseit;

abstract class Base
{
	Base()
	{
		System.out.println("Base Constructor");
		
	}
	public abstract void fun();
}
class Derived extends Base
{
	Derived()
	{
		System.out.println("Derived Constructor");
	}
	public void fun()
	{
		System.out.println("Derived Function");
	}
	
}
class AbstractDemo 
{
	public static void main(String[] args) 
	{
		Derived d = new Derived();
		d.fun();
	}
}
