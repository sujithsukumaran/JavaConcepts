package coreJava;

public final class FinalDemo {

	final static int i = 1; 
    
	public static void main(String[] args) {
		//if uncommented this will throw error
		//i = 3;
	
	}
	
	//if uncommented this will throw error
	/*
	 * public int anothermethod() { i =2; return i; }
	 */
}
