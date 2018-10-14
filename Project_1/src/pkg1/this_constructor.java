// calling constructor by this keyword

package pkg1;

public class this_constructor {

	public this_constructor() {
		
		this(10);
		System.out.println("This is default constructor");
		
	
	}
	
public this_constructor(int a) {
		
		this(10, 11);
		System.out.println("This is one parametrized constructor");
		
	
	}

public this_constructor(int a , int b) {
	
	this(10, 11, 12);
	System.out.println("This is two parametrized constructor");
	

}

public this_constructor(int a , int b, int c) {
	
	
	System.out.println("This is three parametrized constructor");
	

}
	
	public static void main(String[] args) {
		
		this_constructor jitender = new this_constructor();
	
	}
	
	
}
