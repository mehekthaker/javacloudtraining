//Implementing hierarchical inheritance
abstract class Parent
{
	abstract void child();
}

//Child class A inherits Parent class
class A extends  Parent
{
	void child() 
	{
		System.out.println("Parent has child A");
	}
}

//Child class B inherits Parent class
class B extends  Parent
{
	void child() 
	{
		System.out.println("Parent has child B");
	}
}

//Child class C inherits Parent class
class C extends  Parent
{
	void child() 
	{
		System.out.println("Parent has child C");
	}
}

public class HierarchicalInheritance {

	public static void main(String args[])
	{
		Parent parent[] = new Parent[3]; //Created array of objects
	
		parent[0] = new A();
		parent[0].child();
	
		parent[1] = new B();
		parent[1].child();
	
		parent[2] = new C();
		parent[2].child();
		
	}		
}
