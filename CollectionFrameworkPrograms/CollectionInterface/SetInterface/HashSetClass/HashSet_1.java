package SetInterface.HashSetClass;

import java.util.HashSet;

/**
 * Set - Not Indexed, No Duplicate, Order Not Preserved
 * HashSet - Same as Set
 * @author Rachit
 *
 */
public class HashSet_1 {

	public static void main(String args[]) {
		//Premitive types are not allowed. Wrapper class are used
		HashSet<Double> hs=new HashSet<Double>();

		//Order is not preserved
		hs.add(12.12);
		//Duplicate is not allowed
		hs.add(12.12);
		hs.add(15.23);
		hs.add(5.23);
		hs.add(125.23);
		hs.add(17.23);

		System.out.println(hs);
	}
}
