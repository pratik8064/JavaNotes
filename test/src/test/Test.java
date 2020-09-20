/**
 * 
 */
package test;

import java.util.Arrays;


class Test {	
	
	
	public static void main(String[] args) {
	
	/*Car c1 = new Car();
	c1.setNumberOfSeats(6);
	c1.setColour("Black");
	c1.setWheelsCount(4);
	c1.setWindows(6);
	
	System.out.println(c1.getNumberOfSeats());
	System.out.println(c1.getColour());
	System.out.println(c1.getWheelsCount());
	System.out.println(c1.getWindows());
	
	System.out.println(c1.printCarDetails());
	Car c2 = new Car(4,5,4,"White");
	System.out.println(c2.printCarDetails());
	Car c3 = new Car(4,6,4);
	System.out.println(c3.printCarDetails());
	
	*/
		
		Student s = new Student();
		
		//s.test();   // method override
		
		s.test(5); // method overload
		
		
		Animal a = new Animal();
		a.canWalk();
		
		System.out.println();
		
	}
	
	
}
