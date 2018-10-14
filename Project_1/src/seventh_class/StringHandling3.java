package seventh_class;

public class StringHandling3 {
	
	public static void main(String[] args) {
		
		String s = "My name is Jitender";
		
		String[] s1 = s.split(" ");
		
		int count = 0;
		
		for (int i=0; i<s1.length; i++)
		{
			for (int j=0; j<s1[i].length(); j++)
			{
				
				if (s1[i].charAt(j) == 'e')
				{
					
					count++;
					
				}
			}
			
		}
		
		System.out.println("Occurence of 'e' in the given string is: "+count);
		
		
		
		
	}

}
