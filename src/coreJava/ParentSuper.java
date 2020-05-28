package coreJava;

public class ParentSuper {

	//public String family;

	 String family = "Kapoor";
	
	public static void main (String[] args)
	{
		
		ParentSuper p = new ParentSuper();
		p.ancestral();
	}

	public void ancestral()
	{
		// TODO Auto-generated method stub
		String firstName = "Ritu";
		System.out.println(firstName+"Super"+family);
		System.out.println("We are the Kapoor family method");

	}
	
	public ParentSuper()
	{
		System.out.println("Welcome to Kapoor family constructor");
	}

}
