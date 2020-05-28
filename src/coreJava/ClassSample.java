package coreJava;

public class ClassSample implements InterfaceSample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ClassSample c = new ClassSample();
    c.country();
    c.continent();
    
    //cannot instantiate an interface
    //InterfaceSample d = new InterfaceSample();
    
	}
	
	public void country()
	{
		System.out.println("Country name is India");
	}
	
	public void continent()
	{
		System.out.println("Continent name is Asia");
	}

}
