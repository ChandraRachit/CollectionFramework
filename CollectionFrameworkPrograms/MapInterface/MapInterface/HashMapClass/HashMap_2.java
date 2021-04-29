package MapInterface.HashMapClass;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap_2 {

	public static void main(String args[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(3, 340);
		hm.put(4, 4440);
		hm.put(22, 50220);
		hm.put(5, 550);
		hm.put(1, 101);
		hm.put(6, 60);
		hm.put(7, 70);
		hm.put(4, 40);
		hm.put(0, 001);
		hm.put(2, 203);
		
		System.out.println("HashMap values (Before Sorting)= "+ hm.keySet());
		
		//Keeping values to TreeMap to sort Keys
		TreeMap<Integer,Integer> tm=new TreeMap<>(hm);
		System.out.println("HashMap values (After Sorting)=  "+tm.keySet());

	}

}
