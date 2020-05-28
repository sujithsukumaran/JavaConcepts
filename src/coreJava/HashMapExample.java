package coreJava;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Sujith", 35);
		hm.put("Aswathi", 30);
		hm.put("Aswathi", 30);
		hm.put("Yuvi", 4);
		hm.put("Home", null);
		
		System.out.println(hm);
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Shawshank Redemption", 1993);
		ht.put("Titanic", 1997);
		ht.put("Avatar", 2009);
		ht.put("Avatar", 2009);
		//ht.put("Avatar 2", null);

		System.out.println(ht);
		
	}

}
