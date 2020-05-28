package coreJava;

public class ChildSuper extends ParentSuper {

	public static void main (String[] args)
	{
		ChildSuper c = new ChildSuper();
		c.familyHistory();
		//c.ancestral();
		
	}
	
	public void familyHistory() {
		// TODO Auto-generated method stub
		String family = "Nanda";
		String firstName = "Ritu";
		//System.out.println(firstName+" "+family);
		
		//use Super to get Parent familyname.
		System.out.println(firstName+" "+super.family);
		super.ancestral();
		
	}
	
	public void ancestral()
	{
		System.out.println("We are the Nanda family method");
	}
	
	public ChildSuper()
	{
		super();
		System.out.println("Welcome to Nanda family constructor");
	}
	

}
