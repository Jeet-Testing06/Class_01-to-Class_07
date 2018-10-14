// List of prime numbers between 5 and 50

package fifth_Class;

public class Listofprime {
	
	public static void main(String[] args) {
		
		
		boolean flag = false;
		
		for (int i = 5; i<=50; i++)
		{
			for (int j = 2; j<=i-1; j++)
			{
				
				if (i%j==0)
				{
					flag = true;
					break;
					
				}
				else
				{
					
					flag = false;
					
				}
				
				
			}
			
			if (flag == false && i!= 1)
			{
				System.out.println("Prime number is: "+i);
			}
			
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	

}
