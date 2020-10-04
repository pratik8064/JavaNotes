/**
 * 
 */
package test;

public abstract class Person implements Walkable{

	String name;
	public String contactNo;
	public String address;
	int marks = 200;
	
//	public Person() {
//		System.out.println("person construction with no inputs");
//	}
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public void test() {
		System.out.println("This is test function in persons class");
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

}