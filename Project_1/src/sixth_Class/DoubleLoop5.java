package sixth_Class;

public class DoubleLoop5 {
	
	public static void main(String[] args) {
		
		int z =5;
		
		for (int i = 1; i<=5; i++)
		{
			for (int j=1; j<z; j++)
			{
				System.out.print(" ");	
			}
			
				z = z-1;
				
			for (int k=1; k<i*2; k++)
			{
				System.out.print("*");
			}
			
				System.out.println();
		}
	}
}