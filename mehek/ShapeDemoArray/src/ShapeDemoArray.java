//Creates an abstract class and all the child classes overrides its method by creating an array of Shape class
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

//This main class creates array of objects to display the results 
public class ShapeDemoArray {

	public static void main(String args[]) 
	{
		Shape[] shape = new Shape[3];
		shape[0] = new Circle();
		shape[0].draw();
		
		shape[1] = new Polygon();
		shape[1].draw();
		
		shape[2] = new Rectangle();
		shape[2].draw();
		
		
		
	}
}
