package ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * List - Indexed, Duplicate, order Preserved 
 * ArrayList - Dynamic Array, Non Thread safe, Null allowed
 * 
 * @author Rachit
 *
 */
public class ArrayList_1 {

	public static void main(String args[]) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add("Four");
		arrayList.add("Five");
		arrayList.add("Six");
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add(null);

		System.out.println("Array List in List format ");
		System.out.println("ArrayList Length = " + arrayList.size());
		System.out.println(arrayList);
		System.out.println("-----------------------------------------------------------");

		arrayList.remove(2);
		System.out.println("Array List in List format after deleting value from index 2");
		System.out.println("ArrayList Length = " + arrayList.size());
		System.out.println(arrayList);
		System.out.println("-----------------------------------------------------------");

		arrayList.remove("Six");
		System.out.println("Array List in List format after deleting value Six");
		System.out.println("ArrayList Length = " + arrayList.size());
		System.out.println(arrayList);
		System.out.println("-----------------------------------------------------------");

		System.out.println("Verify Element is present One =" + arrayList.contains("One"));
		System.out.println("Is the ArrayList Empty =" + arrayList.isEmpty());
		System.out.println("-----------------------------------------------------------");

		System.out.println("######################   Travesing   ######################");
		System.out.println("-----------------------------------------------------------");

		// Traversal by Foreach loop
		System.out.println("Printing [ArrayList] Value by For each loop - 1");
		for (String name : arrayList) {
			System.out.println(name);
		}
		System.out.println("-----------------------------------------------------------");

		// Traversal by Iterator
		System.out.println("Printing [ArrayList] Value by Iterator - 2");
		Iterator<String> itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------------------------------------");

		// Travesal by ListIterator - Used for Backward
		System.out.println("Printing [ArrayList] Value by ListIterator - 3");
		ListIterator<String> listItr = arrayList.listIterator(arrayList.size());
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		System.out.println("-----------------------------------------------------------");

		// Traversal by for each method - Java 8
		System.out.println("Printing [ArrayList] Value by Foreach Method - 4");
		arrayList.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("-----------------------------------------------------------");
	}

}
