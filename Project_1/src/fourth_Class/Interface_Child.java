// Interface Parent  -- Child Class


package fourth_Class;

public class Interface_Child implements Interface {
	
	
	public void a() {
		
		System.out.println("Body given to a");
		
		
	}
	
	public void b() {
		
		System.out.println("Body given to b");
		
	}
	
	public static void main(String[] args) {
		
		Interface_Child obj = new Interface_Child();
		obj.a();
		obj.b();
		
		
		
		
		
	}
	
	

}
