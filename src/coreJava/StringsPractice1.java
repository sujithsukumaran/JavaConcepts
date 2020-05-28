package coreJava;

public class StringsPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Checking validity of an email address using String class.
		String str = new String("sujithgmail.com");
		if (str.contains("@")) {
			System.out.println(str + " is a valid email");
		} else {
			System.out.println(str + " is not an acceptable email format");
		}

		// reversing a string
		String actual = "iH yaS";
		int stringLength = actual.length();
		String reverse = "";

		for (int i = stringLength - 1; i >= 0; i--) {

			reverse = reverse + actual.charAt(i);

		}
		System.out.println(reverse);
		str.concat(" is my email");
		//immutability of string
		System.out.println(str); //will print only sujithgmail.com
        System.out.println(str.concat(" is my email")); //will print concatenated string
        
        
        //reverse using mutable strings StringBuffer and StringBuilder
        StringBuilder strBuild = new StringBuilder("MOSI");
        System.out.println(strBuild.reverse());
        
        //equals and = demo
        String a = "malayalam";
        String b = "malayalam";
        
        String c = new String("hello");
        String d = new String("hello");
        if(a.equals(b))
        {
        	System.out.println("Content is same for a and b");
        	
        }
        if (a==b)
        {
        	System.out.println("References are same for a and b, since it is String literals.");
        }
        
        if(c.equals(d))
        {
        	System.out.println("Content is same for c and d");
        }
        
        if(c==d)
        {
        	System.out.println("References are same for c and d");
        }
        else
        {
        	System.out.println("References for c and d are different as it is String class used.");
        }
	}

}
