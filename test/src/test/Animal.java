/**
 * 
 */
package test;

/**
 * @author Pratik Suryawanshi
 *
 */
public class Animal implements Walkable{

	/* (non-Javadoc)
	 * @see test.Walkable#canWalk()
	 */
	
	protected String type;
	private String location;
	public String scientificName;
	
	
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	

	@Override
	public boolean canWalk() {
		
		System.out.println("inside canWalk of animal");
		return true;
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
