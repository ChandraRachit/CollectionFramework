package MapInterface.HashMapClass;

import java.util.HashMap;

public class HashMap_1 {
	
	public static void main(String args[]) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Hello", "Rachit");
		hm.put("Hello", "Rachit");
		hm.put("Hello", "Rachit");
		hm.put("Hey", "Raunak");
		hm.put("Bye", "Raunak");
		System.out.println("HashMap = "+hm); //HashMap = {Hello=Rachit, Hey=Raunak, Bye=Raunak}
		

		
	}

}
