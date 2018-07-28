//Create abstract class shape. Declare "draw()" function as abstract. From this class define "Triangle"
//"Polygon" and "Circle". Create an array of shape having three elements.
// Store child objects into this array and call their draw functions.


public class ShapeTest {
	
	public static void main(String args[]) 
	{
		Shape[] shape = new Shape[3];  //object array is created
		
		shape[0] = new Triangle();
		shape[0].draw(); 	//object of type Triangle is instantiated
		
		shape[1] = new Polygon();
		shape[1].draw();	//object of type Polygon is instantiated
		
		shape[2] = new Circle();
		shape[2].draw();	//object of type Circle is instantiated
		
		
	}

}
