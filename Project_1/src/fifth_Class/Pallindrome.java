// Number is pallindrome or not


package fifth_Class;

import java.util.Scanner;

public class Pallindrome {
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter number for checking whether it is pallindrome or not");
		int a  = s.nextInt();
		int m;
		m = a;
		int x;
		int y = 0;
		
		while (a>0)
		{
			
			x = a%10;
			y = y*10+x;
			a = a/10;
			
		}

		if (y==m)
		{
			
			System.out.println("Number is pallindrome");
		}
		else
		{
			
			System.out.println("Number is not pallindrome");
		}
		
		s.close();
		
	}

}