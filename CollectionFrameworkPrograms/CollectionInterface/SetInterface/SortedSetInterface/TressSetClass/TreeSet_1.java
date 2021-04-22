package SetInterface.SortedSetInterface.TressSetClass;

import java.util.TreeSet;

/**
 * Set - Not Indexed, Order Not Preserved,No Duplicate
 * TreeSet - Sorted 
 * @author Rachit
 *
 */
public class TreeSet_1 {

	public static void main(String args[]) {
		TreeSet<Double> ts=new TreeSet<Double>();
		//Order is not preserved
		ts.add(12.12);
		//Duplicate is not allowed
		ts.add(12.12);
		ts.add(15.23);
		ts.add(5.23);
		ts.add(125.23);
		ts.add(17.23);

		System.out.println(ts);
	}

}
