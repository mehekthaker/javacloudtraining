//implementing all the four access modifiers that is default, public, private, protected

public class CheckDemo extends ImpProtected {

	 
	public static void main(String args[])
	{
		ImpProtected obj = new ImpProtected();
		obj.display();
		
		DefaultClass obj = new DefaultClass();
		obj.display();
		
		ImpPublic obj = new ImpPublic();
		obj.display();
		
		ImpPrivate obj = new ImpPrivate();
		obj.display();
	}

}
