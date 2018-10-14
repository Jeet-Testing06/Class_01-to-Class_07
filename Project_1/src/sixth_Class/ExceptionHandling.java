// try catch

package sixth_Class;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		System.out.println("Jitender");
		
		try {
			int a = 5/0;
			}
			
			catch(Exception e)
			{
			System.out.println("Exception handled and is giving why it happened !");
			e.printStackTrace();
			}
		
		System.out.println("Second Line");
		
		
	}

}
