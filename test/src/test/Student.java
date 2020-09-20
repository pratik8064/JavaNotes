/**
 * 
 */
package test;

import java.util.HashMap;

/**
 * @author Pratik Suryawanshi
 *
 */

// Encapsulation

public class Student extends Person implements Walkable {
	
	// class variables
	// member variables
	private int rollNumber;
	private String location;
	private Boolean isGrad;
	private HashMap<String, Integer> grades;
	int marks = 100;
	
	public Student() {
		//super();
	}
	
	public Student(String name, int rollNumber, String contactNo, String address, String location, Boolean isGrad) {
		super(name);
		this.rollNumber = rollNumber;
		this.contactNo = contactNo;
		this.address = address;
		this.location = location;
		this.isGrad = isGrad;
	}

	public String getDetails() {
		return this.name + " " + this.rollNumber + " " + this.contactNo + " " + this.address + " " + this.location + " " + isGrad;
	}

	// static variables
	static String className = "8th Standard";
	
	public final String schoolName = "some skool";
	
	final String getSchoolName() {
		return this.schoolName;
	}
	
	//static method
	public static String getClassName() {
		return "some class name";
	}
	
	
	// class methods
	// camel case
	// getter method	

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Boolean getIsGrad() {
		return isGrad;
	}

	public void setIsGrad(Boolean isGrad) {
		this.isGrad = isGrad;
	}
	
	private String getLocation() {
		return this.location;
	}
	
	private void setLocation(String location) {
		this.location = location;
	}
	
	public boolean isInIndia() {
		return getLocation().equals("India");
	}
	
	public void test() {
		
		System.out.println("This is test method : " + super.marks + " in student");
		
	}
	
	public void test(int x) {
		super.test();
		System.out.println("This is test with "+ x +"method in student");
	}

	/* (non-Javadoc)
	 * @see test.Walkable#canWalk()
	 */
	@Override
	public boolean canWalk() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see test.Walkable#getLegs()
	 */
	@Override
	public int getLegs() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// Student file changes
	
}
