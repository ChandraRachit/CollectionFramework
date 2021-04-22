package ListInterface.VectorCLass;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * List - Indexed, Duplicate, Order Preserved
 * Vector - Dynamic Array, Thread Safe, Came in 1.0 having extra features, Enumeration 
 * @author Rachit
 *
 */
public class Vector_1 {
	
	public static void main(String args[]) {
		Vector<String> vector=new Vector<String>();
		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		vector.add("Four");
		vector.add("Five");
		vector.add("Six");
		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		
		System.out.println("Vector in List format ");
		System.out.println("Vector Length = "+vector.size());
		System.out.println(vector);
		System.out.println("-----------------------------------------------------------");
		
		vector.remove(2);
		System.out.println("Vector in List format after deleting value from index 2");
		System.out.println("Vector Length = "+vector.size());
		System.out.println(vector);
		System.out.println("-----------------------------------------------------------");
		
		vector.remove("Six");
		System.out.println("Vector in List format after deleting value Six");
		System.out.println("Vector Length = "+vector.size());
		System.out.println(vector);
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Verify Element is present One =" +vector.contains("One"));
		System.out.println("Is the Vector Empty ="+vector.isEmpty());
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("######################   Travesing   ######################");
		System.out.println("-----------------------------------------------------------");

		//Traversal by Foreach loop
		System.out.println("Printing [Vector] Value by For each loop - 1");
		for(String name : vector) {
			System.out.println(name);
		}
		System.out.println("-----------------------------------------------------------");
		
		//Traversal by Iterator
		System.out.println("Printing [Vector] Value by Iterator - 2");
		Iterator <String> itr=vector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------------------------------------");
		
		//Travesal by ListIterator - Used for Backward 
		System.out.println("Printing [Vector] Value by ListIterator - 3");
		ListIterator <String> listItr=vector.listIterator(vector.size());
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		System.out.println("-----------------------------------------------------------");
		
		//Traversal by for each method - Java 8
		System.out.println("Printing [Vector] Value by Foreach Method - 4");
		vector.forEach(e->{
			System.out.println(e);
		});
		System.out.println("-----------------------------------------------------------");
		
		//Traversal by Enumeration
		System.out.println("Printing [Vector] by Enumeration - 5");
		Enumeration em=vector.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		System.out.println("-----------------------------------------------------------");
		
	}
}
