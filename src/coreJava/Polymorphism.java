package coreJava;

public class Polymorphism implements InterfaceSample, InterfaceSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Runtime Polymorphism examples - Objects of return type interfaces instantiated
		InterfaceSample one=new Polymorphism();
		one.continent();
		one.country();
		
		InterfaceSample2 two = new Polymorphism();
		two.district();
		two.state();

	}

	@Override
	public void state() {
		// TODO Auto-generated method stub
		System.out.println("State name is Kerala");
	}

	@Override
	public void district() {
		System.out.println("District name is Palakkad");
	}

	@Override
	public void country() {
		System.out.println("Country name is India");
	}

	@Override
	public void continent() {
		System.out.println("Continent name is Asia");

	}

}
