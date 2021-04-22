package SetInterface.LinkedHashSetClass;

import java.util.LinkedHashSet;

public class LinkedHashSet_1 {

	public static void main(String[] args) {
		//Premitive types are not allowed. Wrapper class are used
		LinkedHashSet<Double> hs=new LinkedHashSet<Double>();

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
