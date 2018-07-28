//define 2 classes "First" and "Second" with number variables, member functions and constructors of your choice
//Now define a class "Two" in which define main function
//In main function create various instances of first and second class and call their individual member functions

public class Two {

	public static void main(String args[]) 
	{
		First first = new First();
		Second second = new Second(20,30); //objects of both the classes are created
		
		first.multiply(2,7);
		second.subtract(50, 30);	//calls their respective method
		
		System.out.println("---------------------------");
		
		First first1 = new First();
		Second second1 = new Second(40,50);
		
		first1.divide(14,7);	//objects of both the classes are created
		second1.add(50, 3);		//calls their respective method
	}
	
}
