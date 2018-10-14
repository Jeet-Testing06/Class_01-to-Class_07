// Factorial of a number


package fifth_Class;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		System.out.println("Enter number whose factorial you want to calculate");
		int a  = s.nextInt();
		
		
		int x = 1;
		
		for (int i = a; i>0; i--) {
			
			x = x*i;
			
		}
		
		if(a==0) {
			System.out.println("Enter valid number");
		}
		else {
		System.out.println(x);
		}
		
		

		s.close();
		
	}
		
}
