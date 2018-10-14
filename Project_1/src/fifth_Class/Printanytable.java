// Table


package fifth_Class;

import java.util.Scanner;

public class Printanytable {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter number whose table you want to get print");
		int a  = s.nextInt();
		
		
		
		for (int i = 1; i<=10; i++)
		{
			
			int x =  a*i;
			System.out.println(a +"*" + i + "=" + x);
			
			
			
		}
		
		s.close();
}
}