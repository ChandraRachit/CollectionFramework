package ListInterface.LinkedListClass;
import java.util.LinkedList;

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
		System.out.println();
		
		linkedList.remove(2);
		System.out.println("LinkedList in List format after deleting value from index 2");
		System.out.println("LinkedList Length = "+linkedList.size());
		System.out.println(linkedList);
		System.out.println();
		
		linkedList.remove("Six");
		System.out.println("LinkedList in List format after deleting value Six");
		System.out.println("LinkedList Length = "+linkedList.size());
		System.out.println(linkedList);
		System.out.println();
		
		System.out.println("Verify Element is present One =" +linkedList.contains("One"));
		System.out.println("Is the linkedList Empty ="+linkedList.isEmpty());
		
	}

}
