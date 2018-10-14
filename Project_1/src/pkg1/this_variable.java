// variable differentiate by by this keyword
// variable in class - global
// variable in method - local

package pkg1;

public class this_variable {
	
	//int a;
	 int a = 23;
	
	public void method1(int a) {
		
		//a=a;
		this.a=a;
		
	}

	
	public static void main(String[] args) {
		
		this_variable jitender = new this_variable();
		jitender.method1(5);
		
		System.out.println(jitender.a);

	}
	
	
}