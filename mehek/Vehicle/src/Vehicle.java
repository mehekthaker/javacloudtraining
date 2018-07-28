
public class Vehicle {

	private int currentSpeed;
	private int direction;
	private String ownerName;
	private int vehicleIdNo;
	private static int identificationNumber = 100000;
	private String initialOwnerName;
	private final int turn_left = 50;
	private final int turn_right = 50;
	private int change;
	//private String turn;

	Vehicle() {
	}

	Vehicle(String name) {
		initialOwnerName = name;
	}

//	public static int gethighestIdentificationNumber(int vehicleIdNo) {
//		int highestIdentificationNumber = vehicleIdNo;
//		return highestIdentificationNumber;
//	}
	public static int gethighestIdentificationNumber() {
		return identificationNumber;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public int changeSpeed(Vehicle vehicle) {
		vehicle.currentSpeed = vehicle.currentSpeed + vehicle.change;
		return vehicle.currentSpeed;
	}
	public void stop(int currentSpeed) {
		this.currentSpeed = 0;
	}
	

	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public int turnLeft(Vehicle vehicle) 
	{
		//System.out.println("turnleft");
		vehicle.direction = vehicle.direction + vehicle.change + turn_left;
		if(vehicle.direction>=360) {
			vehicle.direction = vehicle.direction - 360;
		}
		
		return vehicle.direction;
	}	
	public int turnRight(Vehicle vehicle) 
	{
		vehicle.direction = vehicle.direction - vehicle.change - turn_right;
		if(vehicle.direction<0) {
			vehicle.direction =360 - vehicle.direction;
		}
		return vehicle.direction;
	}
	
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	
	public String getInitialOwnerName() {
		return initialOwnerName;
	}
	public void setInitialOwnerName(String initialOwnerName) {
		this.initialOwnerName = initialOwnerName;
	}

	
	public int getVehicleIdNo() {
		int vehicleIdNo = identificationNumber + 1;
		identificationNumber+=1; 
		return vehicleIdNo;
	}

@Override
public String toString() {
	return "Vehicle{" +" Changed direction: "+direction+", Changed Speed: "+currentSpeed+ ", Highest identification Number: "+identificationNumber+ "}";
}

}
