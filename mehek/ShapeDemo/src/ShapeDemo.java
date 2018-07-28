//Creates an abstract class and all the child classes implements and overrides its method
abstract class Shape
{
	abstract void draw();
}

//Circle class implements abstract class shape
class Circle extends Shape
{
	void draw() 
	{
		System.out.println("drawing Circle");
	}
}

//Polygon class implements abstract class shape
class Polygon extends Shape
{
	void draw() 
	{
		System.out.println("drawing Polygon");
	}
}

//Rectangle class implements abstract class shape
class Rectangle extends Shape
{
	void draw() 
	{
		System.out.println("drawing Rectangle");
	}
}

//This main class creates objects to display the results 
public class ShapeDemo {

	public static void main(String args[]) 
	{
		Shape s = new Circle();
		s.draw();
		
		Shape s1 = new Polygon();
		s1.draw();
		
		Shape s2 = new Rectangle();
		s2.draw();
		
	}
}
