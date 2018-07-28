//Define class "Parent1" with some data
//Define interface "Parent2" with some data
//Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.
public class Test {

	public static void main(String args[]) 
	{
		Parent1 p1 = new Parent1();
		Child c = new Child();
		
		p1.display(); //displays the parent display() method
		c.display();	//displays the child display() method
		c.parent();		//displays the interface method
		
		
	}
	
}
