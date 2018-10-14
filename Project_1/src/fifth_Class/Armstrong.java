// Number is armstrong or not

package fifth_Class;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter number whose armstrong number you want to get:");
		int a  = s.nextInt();
		int m = a;
		int count  = 0;
		while (a != 0)
		{
			a = a/10;
			count++;
			
		}
		
		System.out.println("Number of digits: "+count);
		
		int x;
		int sum = 0 ;
		
		while (m>0)
		{
			x = m%10;
			m = m/10;
			sum = (int)Math.pow(x, count) + sum;

		}
		
			System.out.println("Answer is: "+sum);
	
			s.close();
		
	}

}
