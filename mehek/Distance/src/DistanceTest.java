import java.util.*;

public class DistanceTest {
	public static void main(String args[])
	{
		Distance distance1 = new Distance();
		Distance distance2 = new Distance();
		Distance dist = new Distance();//Create three objects of the class
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first distance in inches");
		distance1.setInches(scanner.nextFloat());
		float distInch1 = distance1.getInches();
		
		System.out.println("Enter the first distance in feet");
		distance1.setFeet(scanner.nextInt());
		int distFeet1 = distance1.getFeet();
		
		System.out.println("Enter the second distance in inches");
		distance2.setInches(scanner.nextFloat());
		float distInch2 = distance2.getInches();
		
		System.out.println("Enter the second distance in feet");
		distance2.setFeet(scanner.nextInt());
		float distFeet2 = distance2.getFeet();
		
		dist = dist.sum(distance1, distance2);
		System.out.println("Distance is "+dist.getFeet()+" feet and "+dist.getInches()+" inches");
	}

}
