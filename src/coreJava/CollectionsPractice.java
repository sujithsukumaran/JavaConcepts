package coreJava;

import java.util.ArrayList;

public class CollectionsPractice {


	public static void main(String[] args) {
	
		int a[] = {4,5,5,5,4,6,6,6,6,9,4};
		
		/*
		 * take each number count number of times each is present in the array publish
		 * count against each number
		 */
		
		ArrayList<Integer> find = new ArrayList<Integer>();
	
		for (int i=0; i<a.length; i++) 
		{
			int count = 0;
			if (!find.contains(a[i]))
			{
				find.add(a[i]);
				count++;
				
				for (int j=i+1;j<a.length; j++)
				{
					if(a[i]==a[j])
					{
					count++;
					}
				}
			System.out.println(a[i]+" occurs "+count+" times");
			}
			
		}

      
	}

	

}
