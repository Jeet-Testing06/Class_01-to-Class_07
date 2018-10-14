package seventh_class;

public class StringHandling2 {
	
	public static void main(String[] args) {
		
		String s = "My name is Jitender";
		
		String[] s1 = s.split(" ");
		
		for (int i=s1.length-1; i>=0; i--)
		{
			for (int j=s1[i].length()-1; j>=0; j--)
			{
				
				System.out.print(s1[i].charAt(j));
			}
			
			System.out.print(" ");
			
		}
		
		
		
		
		
	}

}
