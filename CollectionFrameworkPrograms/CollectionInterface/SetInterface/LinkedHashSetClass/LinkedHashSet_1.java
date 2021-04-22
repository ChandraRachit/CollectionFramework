package SetInterface.LinkedHashSetClass;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Set - No duplicate, No Index, No Order is Preserved
 * LinkedHashSet - Maintain Insertion Order,permits null elements
 * @author Rachit
 *
 */
public class LinkedHashSet_1 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		//Insertion Order is preserved
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Three");
		lhs.add("Four");
		lhs.add("Five");
		lhs.add("Six");
		//Null Value is allowed
		lhs.add(null);
		// Duplicate is not allowed
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Three");
		lhs.add(null);

		System.out.println(lhs);
		System.out.println("######################   Travesing   ######################");
		System.out.println("-----------------------------------------------------------");

		// Traversal by Foreach loop
		System.out.println("Printing [LinkedHashSet] Value by For each loop - 1");
		for (String name : lhs) {
			System.out.println(name);
		}
		System.out.println("-----------------------------------------------------------");

		// Traversal by Iterator
		System.out.println("Printing [LinkedHashSet] Value by Iterator - 2");
		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------------------------------------");

		// Traversal by for each method - Java 8
		System.out.println("Printing [LinkedHashSet] Value by Foreach Method - 3");
		lhs.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("-----------------------------------------------------------");
	}
}
