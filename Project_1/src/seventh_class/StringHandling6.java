package seventh_class;

public class StringHandling6 {
	
	public static void main(String[] args) {
		
		String s = "101010101";
		
		int a =0;
		int b =0;
		
		for (int i=0; i<s.length(); i++)
		{
			
			if (s.charAt(i)=='1')
			{
				
				a++;
			}
			else
			{
				
				b++;
			}
			
		}
		
		System.out.print("The final string will look like: ");
		for (int i=0; i<a; i++)
		{
			
			System.out.print("1");
		}
		for (int i=0; i<b; i++)
		{
			
			System.out.print("0");
			
		}
		
	}

}
