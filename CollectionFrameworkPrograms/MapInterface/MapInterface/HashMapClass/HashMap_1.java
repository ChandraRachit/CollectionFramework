package MapInterface.HashMapClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Map - Unique Key HashMap - No Order, Null key and null value is allowed
 * 
 * @author Rachit
 *
 */
public class HashMap_1 {

	public static void main(String args[]) {
		HashMap<Integer, String> hm = new HashMap<>();
		// Insertion Order is not maintained
		hm.put(5, "Five");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(1, "One");
		hm.put(4, "Four");
		hm.put(null, "Four");
		hm.put(7, null);
		// Duplicate Keys are not allowed
		hm.put(5, "Five");
		// Duplicate Values are allowed
		hm.put(6, "Five");

		System.out.println("HashMap = " + hm);
		System.out.println("-----------------------------------------------------------");

		System.out.println("######################   Travesing   ######################");
		System.out.println("-----------------------------------------------------------");

		// Traversal by Foreach loop
		System.out.println("Printing [HashMap] Value by For each loop - 1");
		hm.forEach((e1, e2) -> {
			System.out.println(e1 + " = " + e2);
		});
		System.out.println("-----------------------------------------------------------");

		// Getting value by Key
		System.out.println("Printing [HashMap] value for a key - 2");
		System.out.println("value for Key 3 = " + hm.get(3));
		System.out.println("-----------------------------------------------------------");

		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
		}
		System.out.println("-----------------------------------------------------------");

		for (Integer a : hm.keySet()) {
			System.out.println("Key = " + a + " Value = " + hm.get(a));
		}
		System.out.println("-----------------------------------------------------------");

		/*
		 * Iterator it = hm.keySet().iterator(); while (it.hasNext()) { int key = (int)
		 * it.next(); System.out.println("Key = " + key + " Value = " + hm.get(key)); }
		 * System.out.println(
		 * "-----------------------------------------------------------");
		 */

	}

}
