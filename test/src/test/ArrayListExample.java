
package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


public class ArrayListExample {
	
	
	public static void printList(ArrayList<Integer> myList) {
		System.out.println();
		// address of mylist
		
		
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
	
	public static void removeLast(ArrayList<Integer> myList) {
		
		int n = myList.size() - 1;
		
		myList.remove(n);
		
	}
		
	public static void main(String [] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
//		LinkedList<Integer> linkedList = new LinkedList<Integer>();
//		ArrayList<Student> studentList = new ArrayList<Student>();
//				
		// 1. add method to add object to the list
		// int float .... Wrapper classes Integer, Float ...
		
		// Arraylist is collection
		// arraylist implements list interface
		
		// Arraylist
		// linked list
		// 

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		ArrayListExample.printList(list);
		
		System.out.println();

		
		System.out.println(list.get(0)); // s1.charAt(0) or arr[0]
		System.out.println(list.get(1));// s1.charAt(1)  or arr[1]
		
		

		System.out.println(list.contains(5)); // true
		
		System.out.println(list.isEmpty()); // false
		
		System.out.println(list.size());  // 6
		
		list.remove(2);
		
		ArrayListExample.printList(list);  // [ 12456 ]
		
		removeLast(list);


		ArrayListExample.printList(list);  
		
		
		System.out.println(list.contains(6));
		
		
//		Student s1 = new Student();
//		
//		HashMap<String, Integer> s1Grades = new HashMap<String, Integer>();
//		
//		// key value mapping / one to one mapping
//		// put - used for adding or updating the values
//		
//		s1Grades.put("History", 7);
//		s1Grades.put("Math", 8);
//		s1Grades.put("English", 8);
//		
//		// entry -> (key, value)
//		// set < list of unique items >
//		/*
//		{
//			History -> 7
//			Math  -> 8
//			English - 8
//		}
//		*/
//		
//		System.out.println(s1Grades.get("Math")); // 8
//		System.out.println(s1Grades.get("History")); // 7
//		System.out.println(s1Grades.get("English")); // 8
//		
//		System.out.println(s1Grades.get("biology"));
//		
//		System.out.println(s1Grades);
//		
//		System.out.print(s1Grades.getOrDefault("bio", 10));
//		
//		s1Grades.put("English", 7);
//		
//		System.out.println(s1Grades);
//		
//		System.out.println(s1Grades.size());
//	
//		Set<Entry<String, Integer>> entrySet = s1Grades.entrySet();
//		
//		for (Entry<String, Integer> entry :entrySet) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
//		
//		
//		HashSet<String> set = new HashSet<String>();
//		
//		set.add("Kiran");
//		set.add("Pratik");
//		
//		set.contains("Pratik");
//		set.size();
//		set.isEmpty();
//		set.remove("Pratik");
		
		
		
		
		
	}
	

}
