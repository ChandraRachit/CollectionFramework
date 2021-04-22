package SetInterface.LinkedHashSetClass;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_1 {

	public static void main(String[] args) {
		//Premitive types are not allowed. Wrapper class are used
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();

		//Order is not preserved
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Three");
		lhs.add("Four");
		lhs.add("Five");
		lhs.add("Six");
		//Duplicate is not allowed
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Three");

		System.out.println(lhs);
		System.out.println("######################   Travesing   ######################");
		System.out.println("-----------------------------------------------------------");

		//Traversal by Foreach loop
		System.out.println("Printing [LinkedHashSet] Value by For each loop - 1");
		for(String name : lhs) {
			System.out.println(name);
		}
		System.out.println("-----------------------------------------------------------");

		//Traversal by Iterator
		System.out.println("Printing [LinkedHashSet] Value by Iterator - 2");
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------------------------------------");


		//Traversal by for each method - Java 8
		System.out.println("Printing [LinkedHashSet] Value by Foreach Method - 3");
		lhs.forEach(e->{
			System.out.println(e);
		});
		System.out.println("-----------------------------------------------------------");
	}
}
