// try catch and finally

package sixth_Class;

public class ExceptionHandling1 {
	
	public static void main(String[] args) {
		
		System.out.println("Jitender");
		
		try {
			int a = 5/2;
			System.out.println(a);
			}
			
			catch(Exception e)
			{
			System.out.println("Exception handled and is giving why it happened !");
			e.printStackTrace();
			}
		
			finally
			{
			System.out.println("Final Block");
			}
		
	}

}