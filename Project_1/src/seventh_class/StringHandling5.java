package seventh_class;

public class StringHandling5 {
	
	public static void main(String[] args) {
		
		String s = "My name is Jitender Ahuja";
		int count =0;
		
		for (int i=0; i<s.length(); i++)
		{
			
			if (s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E'
					|| s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' ||
					s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
			{
				
				count++;
				
				
			}
			
			
		}
		
		System.out.println("Occurence of vowels in given string is: "+count);
		
		
		
	}

}
