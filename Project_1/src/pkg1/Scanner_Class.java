// User input scanner class

package pkg1;

import java.util.Scanner;

public class Scanner_Class {

	
	public static void main(String[] args) {
		
		int a;  // local
		
		System.out.println("Enter number");
		
		Scanner jitender = new Scanner(System.in);
		
		a = jitender.nextInt();
		
		System.out.println("User has enter: "+a);
		
		
	}
	
	
	
}
