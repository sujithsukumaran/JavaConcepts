package coreJava;

public class Sample extends AbstractSample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		s.Designation();
		s.Company();
		
		//like Interface, Abstract classes also cannot be instantiated
		//AbstractSample a = new AbstractSample();

	}

	@Override
	public void Company() {
     System.out.println("I work for IBS");		
	}

}
