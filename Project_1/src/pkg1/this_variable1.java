// variable differentiate by by this keyword
// variable in class - global
// variable in method - local

package pkg1;

public class this_variable1 {
	
	//int a;
	 int a = 23;
	
	public void method1(int x) {
		
		a=x;
		//this.a=x;
		
	}

	
	public static void main(String[] args) {
		
		this_variable1 jitender = new this_variable1();
		jitender.method1(5);
		
		System.out.println(jitender.a);

	}
	
	
}