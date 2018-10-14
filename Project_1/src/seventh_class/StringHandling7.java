package seventh_class;

public class StringHandling7 {
	
	public static void main(String[] args) {
		
		String s = "NitiN";
		
		int count =0;
		
		for (int i=0; i<s.length(); i++)
		{
			for (int j=i+1; j<s.length(); j++)
			{
				
				if (s.charAt(i)==s.charAt(j))
				{
					count++;
					
					break;
				}
				
				
			}
			
			
			
		}
		
		
		System.out.println("Duplicate characters inside a string: "+count);
		
		
		
	}

}