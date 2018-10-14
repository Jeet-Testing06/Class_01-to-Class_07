// Static Method and Variable and their use


package fourth_Class;

public class ClassY {

	int a = 10;
	static int b = 9;
	
	public static void increment()
	{
		b = b +1;
		System.out.println(b);
		

	}
	
	public void decrement()
	{
		
		a = a-1;
		System.out.println(a);
		b = b-1;
		System.out.println(b);
		
	}
	
	
	public static void main(String[] args) {
		
		
		ClassY obj = new ClassY();
		obj.decrement();
		ClassY.increment();
		
		
	}
	
	
}
