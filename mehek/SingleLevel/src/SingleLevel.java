//Example of Single Inheritance
class A
{
	public void methodA()
	{
		System.out.println("A-class");
	}
}

//Inheriting class A
public class SingleLevel extends A {
	
	public void methodB() 
	{
		System.out.println("B-class");
	}
	
	public static void main(String args[])
	{
		//Creating the object of the class and calling the functions of both the classes
		SingleLevel b = new SingleLevel();
		b.methodA();
		b.methodB();
	}
}
