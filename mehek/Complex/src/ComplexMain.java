import java.util.*;

public class ComplexMain {
	public static void main(String args[]) 
	{
		Complex C1 = new Complex();
		Complex C2 = new Complex();
		Complex C3 = new Complex();//Create three objects of the class
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the real number for first complex number");
		C1.setReal(scanner.nextFloat());
		float real = C1.getReal();
		
		System.out.println("Enter the imaginary number for first complex number");
		C1.setImaginary(scanner.nextFloat());
		float imag1 = C1.getImaginary();
		
		System.out.println("Enter the real number for second complex number");
		C2.setReal(scanner.nextFloat());
		float real2 = C2.getReal();
		
		System.out.println("Enter the imaginary number for second complex number");
		C2.setImaginary(scanner.nextFloat());
		float imag2 = C2.getImaginary();
		
		C3=C3.sum(C1,C2);//Store the sum in this variable
		System.out.println("The result of the addition of two complex numbers is "+C3.getReal()+" +i "+C3.getImaginary());
	}

}
