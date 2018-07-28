
public class StaticAndNonStatic {

	static int i=1000;
	int j;

	//Defining a static method
	public static void statMethod(int i) 
	{
		System.out.println(i);
	}
	
	
	//Defining a non-static method
	public void nonStatMethod(int j) 
	{
		System.out.println(j);
	}
}
