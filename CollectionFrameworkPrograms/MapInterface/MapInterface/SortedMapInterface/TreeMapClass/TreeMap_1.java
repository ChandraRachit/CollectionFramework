package MapInterface.SortedMapInterface.TreeMapClass;

import java.util.TreeMap;

/**
 * Map - Unique Key
 * TreeMap - Key is sorted ascending , Null key is not allowed, Null Value is allowed
 * 
 * @author Rachit
 *
 */
public class TreeMap_1 {
	public static void main(String args[]) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "One");
		
		// Key is kept in ascending Order
		tm.put(3, "Three");
		tm.put(2, "Two");
		tm.put(4, "Four");
		tm.put(5, "Five");
		
		//Null key is not allowed
		//tm.put(null, "Five");
		
		//Null value is allowed
		tm.put(7,null);
		
		// Duplicate Keys are not allowed
		tm.put(5, "Five");
		
		// Duplicate Values are allowed
		tm.put(6, "Five");

		System.out.println("Hastmap = " + tm);
		System.out.println("-----------------------------------------------------------");

		System.out.println("######################   Travesing   ######################");
		System.out.println("-----------------------------------------------------------");

		// Traversal by Foreach loop
		System.out.println("Printing [Hashmap] Value by For each loop - 1");
		tm.forEach((e1, e2) -> {
			System.out.println(e1 + " = " + e2);
		});
		System.out.println("-----------------------------------------------------------");

		// Getting value by Key
		System.out.println("Printing [Hashmap] value for a key - 2");
		System.out.println("value for Key 3 = " + tm.get(3));
		System.out.println("-----------------------------------------------------------");
		
		
	}
}
