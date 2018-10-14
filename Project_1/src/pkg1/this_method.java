// calling method by this keyword

package pkg1;

public class this_method {

	public void method() {
		
		System.out.println("Method");
		this.method1();
		
	}
	
public void method1() {
	
		this.method2();
		System.out.println("Method 1");	
	
	}

public void method2() {
	
	System.out.println("Method 2");
	this.method3();
}

public void method3() {
	
	System.out.println("Method 3");
	
}
	
	public static void main(String[] args) {
		
		this_method jitender = new this_method();
		jitender.method();
	
	}
	
	
}
