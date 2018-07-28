//Example of Multiple Inheritance
class A
{
	public void methodA()
	{
		System.out.println("A-class");
	}
}

//Inherits class A
class B extends A
{
	public void methodB() 
	{
		System.out.println("B-class");
	}
}

//Inherits class B
public class MultiLevel extends B{
	
	public void methodC() 
	{
		System.out.println("C-class");
	}
	
	public static void main(String args[])
	{
		
		MultiLevel c = new MultiLevel();
		c.methodC();
		c.methodB();
		c.methodA();
	}

}
