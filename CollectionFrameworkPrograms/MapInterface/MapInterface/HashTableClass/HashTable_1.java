package MapInterface.HashTableClass;

import java.util.Hashtable;

/**
 * Map - Unique Key 
 * Hashtable - unique elements,doesn't allow null key or value,synchronized
 * 
 * @author Rachit
 *
 */
public class HashTable_1 {
	public static void main(String args[]) {
		Hashtable<Integer, String> tm = new Hashtable<>();
		tm.put(1, "One");
		// Key is kept in ascending Order
		tm.put(3, "Three");
		tm.put(2, "Two");
		tm.put(4, "Four");
		tm.put(5, "Five");
		//Null key & Null Value is not allowed
		//tm.put(null, "Four");
		//tm.put(7, null);
		// Duplicate Keys are not allowed
		tm.put(5, "Five");
		// Duplicate Values are allowed
		tm.put(6, "Five");

		System.out.println("HashTable = " + tm);
		System.out.println("-----------------------------------------------------------");

		System.out.println("######################   Travesing   ######################");
		System.out.println("-----------------------------------------------------------");

		// Traversal by Foreach loop
		System.out.println("Printing [HashTable] Value by For each loop - 1");
		tm.forEach((e1, e2) -> {
			System.out.println(e1 + " = " + e2);
		});
		System.out.println("-----------------------------------------------------------");

		// Getting value by Key
		System.out.println("Printing [HashTable] value for a key - 2");
		System.out.println("value for Key 3 = " + tm.get(3));
		System.out.println("-----------------------------------------------------------");
	}
}
