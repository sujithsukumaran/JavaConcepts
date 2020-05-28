package coreJava;

public class STATICpractice {

	// instance variables, this can vary for every object.
	int experience;
	String name;
	String designation;
	// class variables, this will be shared among all objects
	static String company = "IBS Software";
	static String location = "Kochi";
	
	/* Static Block Example
	 
	 * static String company; 
	 * static String location; 
	 * static { 
	 * company="TCS";
	 * location = "Bangalore"; 
	 * }
	 */

	// parameterized constructor
	public STATICpractice(int experience, String name, String designation) {
		this.experience = experience;
		this.name = name;
		this.designation = designation;
	}

	// static methods allow only static variables.
	public static void getLocation() {
		System.out.println("These folks are working from " + location);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STATICpractice jas = new STATICpractice(12, "Jasmine", "Solution Architect");
		System.out.println(jas.name + " has " + jas.experience + " years experience and she is a " + jas.designation);

		STATICpractice nan = new STATICpractice(7, "Nandhitha", "Technical Lead");
		System.out.println(nan.name + " has " + nan.experience + " years experience and she is a " + nan.designation);

		STATICpractice suj = new STATICpractice(12, "Sujith", "Senior Test Lead");
		System.out.println(suj.name + " has " + suj.experience + " years experience and he is a " + suj.designation);

		STATICpractice sur = new STATICpractice(12, "Suraj", "Solution Architect");
		System.out.println(sur.name + " has " + sur.experience + " years experience and he is a " + sur.designation);

		// No object instantiation needed for static variables or methods
		System.out.println("These folks work for " + STATICpractice.company);

		STATICpractice.getLocation();

	}

}
