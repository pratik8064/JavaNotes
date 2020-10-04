/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


class Test {
	
	private static int getFeeTotal(ArrayList<Student> list1, ArrayList<CollegeStudent> list2,
			ArrayList<SchoolStudent> list3) {
		// TODO Auto-generated method stub
		int total = 0;
		for( Student s1: list1 ) {
			total = total + s1.getFee();
		}
		for( CollegeStudent s2: list2 ) {
			total = total + s2.getFee();
		}
		for( SchoolStudent s3: list3 ) {
			total = total + s3.getFee();
		}
		return total;
	}
	
	private static int getFeeTotal2(ArrayList<Student> list1) {
		// TODO Auto-generated method stub
		int total = 0;
		for( Student s1: list1 ) {
			total = total + s1.getFee();
		}
		return total;
	}
	
	private static int getFeeTotal3(List<Student> list1) {
		// TODO Auto-generated method stub
		int total = 0;
		for( int i = 0;i < list1.size();i++ ) {
			Student s1 = list1.get(i);
			total = total + s1.getFee();
		
		}
		return total;
	}
	
	
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
		
		//Student s = new Student();
		
		//s.test();   // method override
		
		//s.test(5); // method overload
		
		
		//Person p1 = new Person();
		Person p2 = new Student();
		Person p3 = new SchoolStudent();
		Person p4 = new CollegeStudent();
		
		
		Student s1 = new Student();
		s1.setFee(100);
		
		Student s2 = new CollegeStudent();
		s2.setFee(200);
		
		Student s3 = new SchoolStudent();
		s3.setFee(50);
		
		Student s4 = new PhdStudent();
		s4.setFee(500);
		
		ArrayList<String> list = new ArrayList<String>();
		String[] arr = new String[10];
		
		ArrayList<Student> list1 = new ArrayList<Student>();
		ArrayList<CollegeStudent> list2 = new ArrayList<CollegeStudent>();
		ArrayList<SchoolStudent> list3 = new ArrayList<SchoolStudent>();
		
		
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		
		//list2.add(s2);
		//list3.add(s3);	
		LinkedList<Student> list5 = new LinkedList<Student>();
		
		
		List<Student> newList1 = new ArrayList<Student>();
		List<Student> newList2 = new LinkedList<Student>();
		
		
		int total = Test.getFeeTotal(list1, list2, list3);
		int total2 = Test.getFeeTotal2(list1); 
		int total3 = Test.getFeeTotal3(list1);
		System.out.println(total3);
		
	}
	
}
