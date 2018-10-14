// Number is prime or not



package fifth_Class;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter number to check whether it is prime or not");
		int a  = s.nextInt();

		boolean flag = false;
	
		for (int i = 2; i<= a/2; i++)
		{
			if (a%i == 0)
			{
				flag = true;
				break;
				
			}		
		}
		
		if (flag != true && a!=1)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
		
		s.close();
	}
}