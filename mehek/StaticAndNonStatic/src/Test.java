//Create a class with static and non-static member variables. Define static and non-static member functions. Create instance of this class 
//and call both static and non-static member functions 
public class Test {
	
	public static void main(String args[])
	{
	StaticAndNonStatic sns = new StaticAndNonStatic();
	
	StaticAndNonStatic.statMethod(1000);  //Using class name to load the class
	
	sns.nonStatMethod(300);  //Using object to object to load the class
	}
	
	
}
