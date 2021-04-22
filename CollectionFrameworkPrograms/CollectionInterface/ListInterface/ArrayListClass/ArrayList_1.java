package ListInterface.ArrayListClass;
import java.util.ArrayList;

public class ArrayList_1 {
	
	public static void main(String args[]) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add("Four");
		arrayList.add("Five");
		arrayList.add("Six");
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		System.out.println("Array List in List format ");
		System.out.println("ArrayList Length = "+arrayList.size());
		System.out.println(arrayList);
		System.out.println();
		arrayList.remove(2);
		System.out.println("Array List in List format after deleting value from index 2");
		System.out.println("ArrayList Length = "+arrayList.size());
		System.out.println(arrayList);
		System.out.println();
		arrayList.remove("Six");
		System.out.println("Array List in List format after deleting value Six");
		System.out.println("ArrayList Length = "+arrayList.size());
		System.out.println(arrayList);
	}

}
