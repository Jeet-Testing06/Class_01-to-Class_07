// Implicit and Explicit function
//char int float


package pkg1;

public class ImplicitExplicit_1 {

	
	public static void main(String[] args) {
		
		int a = 98;
		float f = 12.88F;
		char c;
		
		a=(int)f;  // float value in int (explicit function)
		System.out.println(a);
		c = (char)a;   // int value in char (explicit function)
		System.out.println(c);
		
		
	}
	
	
	
}
