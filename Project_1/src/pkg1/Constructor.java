// Constructor

package pkg1;

public class Constructor {

	public Constructor() {
		
		
		System.out.println("This is default constructor");
		
	
	}
	
public Constructor(int a) {
		
		
		System.out.println("This is one parametrized constructor");
		
	
	}

public Constructor(int a , int b) {
	
	
	System.out.println("This is two parametrized constructor");
	

}

public Constructor(int a , int b, int c) {
	
	
	System.out.println("This is three parametrized constructor");
	

}
	
	public static void main(String[] args) {
		
		Constructor jitender = new Constructor();
		Constructor jitender1 = new Constructor(10);		
		Constructor jitender2 = new Constructor(10, 11);
		Constructor jitender3 = new Constructor(10, 11, 12);
	}
	
	
}
