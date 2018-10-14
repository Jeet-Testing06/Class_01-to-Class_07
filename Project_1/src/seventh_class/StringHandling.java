package seventh_class;

public class StringHandling {
	public static void main(String[] args) {
	
		String s = "My name is Jitender";
		
		String[] s1 = s.split(" ");
		
		for (int i=s1.length-1; i>0; i--)
		{
			
			System.out.print(s1[i]+" ");
			
		}
		
		System.out.print(s1[0]);
		
	}
}
