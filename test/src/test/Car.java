package test;

public class Car {

	private int wheelsCount;
	private int numberOfSeats;
	private int windows;
	private String colour;

	public static String brand = "tesla";

	public final static String model = "2020";

	public String printCarDetails() {
		return this.getNumberOfSeats() + "," + this.getWheelsCount() + "," + this.getWindows() + "," + this.getColour();
	}

	Car(int wheelsCount, int numberOfSeats, int windows, String colour) {
		this.colour = colour;
		this.numberOfSeats = numberOfSeats;
		this.wheelsCount = wheelsCount;
		this.windows = windows;

	}

	
	  Car() {
	  
	  }
	 
	

	public Car(int wheelsCount, int numberOfSeats, int windows) {
		super();
		this.wheelsCount = wheelsCount;
		this.numberOfSeats = numberOfSeats;
		this.windows = windows;
	}

	public int getWheelsCount() {
		return wheelsCount;
	}

	public void setWheelsCount(int wheelsCount) {
		this.wheelsCount = wheelsCount;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public static String myStaticMethod() {
		return (brand + " in myStaticMethod ");

	}

}
