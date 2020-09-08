
package test;

import java.util.ArrayList;


public class ArrayListExample {
	
	
	public static void printList(ArrayList<Integer> myList) {
		
		/*for(int i=0; i < myList.size();i++) {
			System.out.println(myList.get(i));
		}
		*/
		for (Integer x : myList) {
			System.out.println(x);
		}
		
		/*
		int arr[] = new int[4];
		
		for(int x: arr) {
			System.out.println(x);
		}
		*/
		
	}
		
	public static void main(String [] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(6);
		
		System.out.println(list.get(0)); // s1.charAt(0)
		System.out.println(list.get(1));// s1.charAt(1)
		System.out.println();

		
		ArrayListExample.printList(list);
		
		
		System.out.println();

		//System.out.println(list.contains(5)); // false
		
		//System.out.println(list.isEmpty()); // false
		
		//System.out.println(list.size());  // 4
		
		list.remove(2);
		
		System.out.println();
		ArrayListExample.printList(list);  // [1 2 2 5 6]
		
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		
	}
	

}
