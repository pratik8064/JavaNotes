/**
 * 
 */
package test;

/**
 * @author Pratik Suryawanshi
 *
 */

// Encapsulation


public class Student {
	
	// class variables
	// member variables
	private String name;
	private int rollNumber;
	private String contactNo;
	private String address;
	private String location;
	private Boolean isGrad;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int rollNumber, String contactNo, String address, String location, Boolean isGrad) {
		super();
		this.name = name;
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
	public String getName() {
		return name;
	}
	
	// setter method
	public void setName(String name) {
		this.name = name;
	}

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


	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
	
	
	
}
