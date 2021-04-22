package ListInterface.LinkedListClass;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * List - Indexed, Duplicate, Order Preserved
 * Linked List - Doubly Linked List, No Thread Safe
 * @author Rachit
 *
 */
public class LinkedList_1 {
	
	public static void main(String args[]) {
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("One");
		linkedList.add("Two");
		linkedList.add("Three");
		linkedList.add("Four");
		linkedList.add("Five");
		linkedList.add("Six");
		linkedList.add("One");
		linkedList.add("Two");
		linkedList.add("Three");
		
		System.out.println("LinkedList in List format ");
		System.out.println("LinkedList Length = "+linkedList.size());
		System.out.println(linkedList);
		System.out.println("-----------------------------------------------------------");
		
		linkedList.remove(2);
		System.out.println("LinkedList in List format after deleting value from index 2");
		System.out.println("LinkedList Length = "+linkedList.size());
		System.out.println(linkedList);
		System.out.println("-----------------------------------------------------------");
		
		linkedList.remove("Six");
		System.out.println("LinkedList in List format after deleting value Six");
		System.out.println("LinkedList Length = "+linkedList.size());
		System.out.println(linkedList);
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Verify Element is present One =" +linkedList.contains("One"));
		System.out.println("Is the linkedList Empty ="+linkedList.isEmpty());
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("######################   Travesing   ######################");
		System.out.println("-----------------------------------------------------------");

		//Traversal by Foreach loop
		System.out.println("Printing [LinkedList] Value by For each loop - 1");
		for(String name : linkedList) {
			System.out.println(name);
		}
		System.out.println("-----------------------------------------------------------");
		
		//Traversal by Iterator
		System.out.println("Printing [LinkedList] Value by Iterator - 2");
		Iterator <String> itr=linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------------------------------------");
		
		//Travesal by ListIterator - Used for Backward 
		System.out.println("Printing [LinkedList] Value by ListIterator - 3");
		ListIterator <String> listItr=linkedList.listIterator(linkedList.size());
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		System.out.println("-----------------------------------------------------------");
		
		//Traversal by for each method - Java 8
		System.out.println("Printing [LinkedList] Value by Foreach Method - 4");
		linkedList.forEach(e->{
			System.out.println(e);
		});
		System.out.println("-----------------------------------------------------------");
	}
}
