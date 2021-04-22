package SetInterface.SortedSetInterface.TressSetClass;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Set - Not Indexed, Order Not Preserved,No Duplicate
 * TreeSet - Sorted 
 * @author Rachit
 *
 */
public class TreeSet_1 {

	public static void main(String args[]) {
		//Premitive types are not allowed. Wrapper class are used
		TreeSet<String> ts=new TreeSet<String>();

		//Order is not preserved
		ts.add("One");
		ts.add("Two");
		ts.add("Three");
		ts.add("Four");
		ts.add("Five");
		ts.add("Six");
		//Duplicate is not allowed
		ts.add("One");
		ts.add("Two");
		ts.add("Three");

		System.out.println(ts);
		System.out.println("######################   Travesing   ######################");
		System.out.println("-----------------------------------------------------------");

		//Traversal by Foreach loop
		System.out.println("Printing [Treeset] Value by For each loop - 1");
		for(String name : ts) {
			System.out.println(name);
		}
		System.out.println("-----------------------------------------------------------");

		//Traversal by Iterator
		System.out.println("Printing [Treeset] Value by Iterator - 2");
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------------------------------------");


		//Traversal by for each method - Java 8
		System.out.println("Printing [Treeset] Value by Foreach Method - 3");
		ts.forEach(e->{
			System.out.println(e);
		});
		System.out.println("-----------------------------------------------------------");
	}

}
