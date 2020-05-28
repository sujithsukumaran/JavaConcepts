package coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> people = new ArrayList<String>();
		ArrayList<String> sivansFamily = new ArrayList<String>();
		ArrayList<String> sujithsFamily = new ArrayList<String>();
		
		//Arrays
		String[] names = {"Sivaprasad","Sujith","Aswathi Sujith","Anjali Sivaprasad",
				"Yugprabhav Sujith", "Aadhav Sivaprasad"};
		
		//Creating Array list from Arrays
		for (int i=0;i<names.length;i++)
		{
			people.add(names[i]);
		}
		
		/*
		 * people.add("Sivaprasad"); people.add("Sujith"); people.add("Aswathi Sujith");
		 * people.add("Anjali Sivaprasad"); people.add("Yugprabhav Sujith");
		 * people.add("Aadhav Sivaprasad");
		 */
		
		Collections.sort(people);
		System.out.println(people);
		Collections.reverse(people);
		System.out.println(people);
		
		//Enhanced for loop
		for (String s: people)
		{
			if(s.contains("Sivaprasad"))
			{
				sivansFamily.add(s);
			}
			else
			{
				sujithsFamily.add(s);
			}
		}

        System.out.println("Sivan's family is "+sivansFamily);
        System.out.println("Sujith's family is "+sujithsFamily);
	}

}
