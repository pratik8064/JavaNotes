/**
 * 
 */
package test;

import java.util.Arrays;

/**
 * @author Pratik Suryawanshi
 *
 */
class Test {	
	
	public static void main(String[] args) {
	
		Student s1 = new Student();
		
		Student s2 = new Student("Devidas");
		
		Student s3 = new Student("s3", 10, "384781", "new sangavi Pune", "India", true);
		
		s1.setName("Pratik");
		
		System.out.println(s1.getName());

		System.out.println(s2.getName());
		
		s1.setName("Kiran");
		
		System.out.println(s1.getName());
		
		System.out.println(Student.className);
		System.out.println(s2.className);
		
		int a = 5;
		int b = 6;
		
		System.out.println(Math.max(a, b));
		System.out.println(s1.schoolName);
		
		//String details = s3.getDetails();
		//System.out.println(details);
		
		System.out.println(s3.getDetails());
		
		
	}
	
	

}
