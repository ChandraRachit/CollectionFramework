package ListInterface.VectorCLass;
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
		System.out.println();
		
		vector.remove(2);
		System.out.println("Vector in List format after deleting value from index 2");
		System.out.println("Vector Length = "+vector.size());
		System.out.println(vector);
		System.out.println();
		
		vector.remove("Six");
		System.out.println("Vector in List format after deleting value Six");
		System.out.println("Vector Length = "+vector.size());
		System.out.println(vector);
		System.out.println();
		
		System.out.println("Verify Element is present One =" +vector.contains("One"));
		System.out.println("Is the Vector Empty ="+vector.isEmpty());
		
	}

}
