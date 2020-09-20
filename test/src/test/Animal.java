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
