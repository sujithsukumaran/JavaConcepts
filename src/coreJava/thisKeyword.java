package coreJava;

public class thisKeyword {
    
	int a = 2;
	public void thisDemo() {
    
    //printing the local variable
    int a=3;
    System.out.println("Local value is " +a);
    
    //printing global class variable
    System.out.println("Global value is " +this.a);
	}
	
	public static void main(String[] args) {
		
		thisKeyword t = new thisKeyword();
		t.thisDemo();
		

	}
	

}
