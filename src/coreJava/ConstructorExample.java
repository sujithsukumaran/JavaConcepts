package coreJava;

public class ConstructorExample {

	int sum;
	//default Constructor
	public ConstructorExample() {
		int a=3;
		int b=4; 
		sum = a+b;
		StringBuffer str = new StringBuffer("hello, welcome to default Constructor");
		str.append(".This is a method without a return type.");
		System.out.println(str);
		
	}
	//parameterized constructor
	public ConstructorExample(String string, int value) {
        
		System.out.println("hello, welcome to parameterized Constructor");
		System.out.println("My password is "+string+value);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this instantiation will invoke the Constructor code
       ConstructorExample c = new ConstructorExample();
       //c.sumPrint();
       
       //parameterized constructor invoked
       ConstructorExample param = new ConstructorExample("hello" , 1234);
     
           		   
	}
	
	public void sumPrint() {
		System.out.println(sum);
    		
	}

}
