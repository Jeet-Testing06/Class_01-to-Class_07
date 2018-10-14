// Static Variable


package fourth_Class;



public class Static {
	
	// static int a = 12;
	int a = 12;
	
	public void increment() {
		
		a = a+1;
		
	}
	
	
	public static void main(String[] args) {
		
			Static obj = new Static();
			
			obj.increment();
			System.out.println(obj.a);
			obj.increment();
			System.out.println(obj.a);
			obj.increment();
			System.out.println(obj.a);
			
			
			Static obj1 = new Static();
			
			obj1.increment();
			System.out.println(obj1.a);
			obj1.increment();
			System.out.println(obj1.a);
			obj1.increment();
			System.out.println(obj1.a);
			
			
		
		
	}
	
	
	
	
	

}
