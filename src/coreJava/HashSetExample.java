package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		HashSet<String> sample = new HashSet<String>();
		sample.add("Suraj");
		sample.add("Jasmine");
		sample.add("Nandhitha");
		sample.add("Sujith");
		sample.add("Sujith");
		
		sample.remove("Sujith");
		System.out.println(sample);
		
		Iterator<String> it = sample.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());

		}
		

		
	}

}
