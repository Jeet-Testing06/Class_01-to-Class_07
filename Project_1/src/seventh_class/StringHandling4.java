package seventh_class;

public class StringHandling4 {
	
	public static void main(String[] args) {
		
		String s = "Nitin";
		
		StringBuilder s1 = new StringBuilder(s);
		
		
		StringBuilder s2 = s1.reverse();
		
		String s3 = s2.toString();
		
		if (s.equalsIgnoreCase(s3))
		{
			
			System.out.println(s+" is Pallindrome");
			
		}
		
		else
		{
			
			System.out.println(s+" is not Pallindrome");
		}
		
		
		
	
		
	}
}