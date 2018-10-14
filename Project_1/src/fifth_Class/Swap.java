//Swap with 3rd Variable

package fifth_Class;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter value of a");
		int a  = s.nextInt();
		System.out.println("Enter value of b");
		int b = s.nextInt();
		
		int x;
		x = a;
		a = b;
		b = x;
		
		System.out.println("Value of a after swapping: "+a);
		System.out.println("Value of b after swapping: "+b);
	
		
		s.close();
		
	}
	
	
	

}
