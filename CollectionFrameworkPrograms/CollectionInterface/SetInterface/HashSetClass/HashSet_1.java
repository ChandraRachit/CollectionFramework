package SetInterface.HashSetClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Set - Not Indexed, No Duplicate, Order Not Preserved
 * HashSet - Same as Set
 * @author Rachit
 *
 */
public class HashSet_1 {

	public static void main(String args[]) {
		//Premitive types are not allowed. Wrapper class are used
		HashSet<String> hs=new HashSet<String>();

		//Order is not preserved
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		hs.add("Six");
		//Duplicate is not allowed
		hs.add("One");
		hs.add("Two");
		hs.add("Three");

		System.out.println(hs);
		System.out.println("######################   Travesing   ######################");
		System.out.println("-----------------------------------------------------------");

		//Traversal by Foreach loop
		System.out.println("Printing [HashSet] Value by For each loop - 1");
		for(String name : hs) {
			System.out.println(name);
		}
		System.out.println("-----------------------------------------------------------");

		//Traversal by Iterator
		System.out.println("Printing [HashSet] Value by Iterator - 2");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------------------------------------");


		//Traversal by for each method - Java 8
		System.out.println("Printing [HashSet] Value by Foreach Method - 3");
		hs.forEach(e->{
			System.out.println(e);
		});
		System.out.println("-----------------------------------------------------------");
	}
}
