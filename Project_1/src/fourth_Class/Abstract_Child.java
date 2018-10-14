// Child Class

package fourth_Class;

public class Abstract_Child extends Abstract {

	
	public void abc() {
		
	System.out.println("Body given to Abstarct Method");	
	}
	
	
	public static void main(String[] args) {
		
		Abstract_Child obj = new Abstract_Child();
		obj.abc();
		obj.add();
			
	}
	
}
