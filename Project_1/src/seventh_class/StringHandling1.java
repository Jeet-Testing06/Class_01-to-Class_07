package seventh_class;

public class StringHandling1 {
	
	public static void main(String[] args) {
		
		String s = "My name is Jitender";
		
		String[] s1 = s.split(" ");
		
		for (int i=0; i<s1.length; i++)
		{
			for (int j=s1[i].length()-1; j>=0; j--)
			{
				
				System.out.print(s1[i].charAt(j));
			}
			
			System.out.print(" ");
			
		}
		
	}
}
