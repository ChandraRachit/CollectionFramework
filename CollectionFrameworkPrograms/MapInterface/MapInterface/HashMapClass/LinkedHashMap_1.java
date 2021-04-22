package MapInterface.HashMapClass;

import java.util.LinkedHashMap;

/**
 * Map - Unique Key
 * LinkedHashMap - Maintains Insertion order,Null key and null value is allowed
 * @author Rachit
 *
 */
public class LinkedHashMap_1 {

	public static void main(String args[]) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(1, "One");
		lhm.put(2, "Two");
		// Maintains Insertion Order
		lhm.put(4, "Four");
		lhm.put(3, "Three");
		lhm.put(5, "Five");
		lhm.put(null, "Five");
		lhm.put(7, null);
		// Duplicate Keys are not allowed
		lhm.put(5, "Five");
		// Duplicate Values are allowed
		lhm.put(6, "Five");

		System.out.println("HashMap = " + lhm);
		System.out.println("-----------------------------------------------------------");

		System.out.println("######################   Travesing   ######################");
		System.out.println("-----------------------------------------------------------");

		// Traversal by Foreach loop
		System.out.println("Printing [Hashmap] Value by For each loop - 1");
		lhm.forEach((e1, e2) -> {
			System.out.println(e1 + " = " + e2);
		});
		System.out.println("-----------------------------------------------------------");

		// Getting value by Key
		System.out.println("Printing [Hashmap] value for a key - 2");
		System.out.println("value for Key 3 = " + lhm.get(3));
		System.out.println("-----------------------------------------------------------");
	}
}
