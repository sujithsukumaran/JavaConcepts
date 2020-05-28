package coreJava;

public class ExceptionsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 24, 12, 4, 2, 1 };

		try {
			for (int i = 0; i < 4; i++) {
				int divide = a[i] / a[i + 1];
				System.out.println(divide);
				/*
				 * ExceptionsHandling eh = new ExceptionsHandling(); // eh.nothingreturned();
				 */			}
		}
		/*
		 * catch (Exception e) { System.out.println("Please check your inputs."); }
		 */
		
		  catch (ArithmeticException ae) {
		  System.out.println("Please check your inputs.");
		  
		  }
		  
		  catch (IndexOutOfBoundsException ie) {
		  System.out.println("Array index size violated");
		  
		  }
		  
		  catch (NullPointerException npe) {
		  System.out.println("One of the variable is returning a null");
		  
		  }
		 

		finally {
			System.out.println("Completed the array element division");
		}

	}

}
