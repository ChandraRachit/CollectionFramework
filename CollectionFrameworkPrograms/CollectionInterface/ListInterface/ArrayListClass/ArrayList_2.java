package ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayList_2 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add("Four");
		arrayList.add("Five");
		System.out.println("Printing ArrayList = " + arrayList);
		System.out.println("######################################################################");

		System.out.println("Reversing the ArrayList by ListIterator - 1");
		ListIterator litr = arrayList.listIterator(arrayList.size());
		while (litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}
		System.out.println();
		System.out.println("######################################################################");

		System.out.println("Reversing the ArrayList by Collections.reverse -2");
		Collections.reverse(arrayList);
		System.out.println(arrayList);
		System.out.println("######################################################################");

	}

}
