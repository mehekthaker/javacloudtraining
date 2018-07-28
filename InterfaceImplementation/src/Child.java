//Inherits both the interface and class
public class Child extends Parent1 implements Parent2
{
	
	public void display() 
	{
		System.out.println("Child extends class Parent1");
	}
	
	public void parent() 
	{
		System.out.println("Child implements interface Parent2");
	}

}
