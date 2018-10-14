// All Methods Calling
// Static to Static
// Static to Non Static
// Non Static to Static





package fourth_Class;

public class ClassZ {
	
	public static void abc ()
	{
		
		System.out.println("Hi, I am a static method");
		
	}
	
	
	public void add() {
		
		int a = 10;
		int b = 20;
		int c  = a + b;
		System.out.println("Result is: "+c);
		
		ClassZ.abc();
		ClassZ obj = new ClassZ();
		obj.abc();
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		ClassZ.abc();
		abc();
		ClassZ obj = new ClassZ();
		obj.abc();
		
		obj.add();
		
		
	}
	
	
	
	

}
