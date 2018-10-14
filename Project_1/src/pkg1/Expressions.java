// Mathematical Expressions -  (((((10 + 2)-2)+2)*2)/2)

package pkg1;

public class Expressions {

	public int add(int a, int b) {
		
		int c;
		c = a + b;
		
		return c;
		
	}
	
	public int sub(int a, int b) {
		
		int c;
		c = a - b;
		
		return c;
		
	}
	
	public int mul(int a, int b) {
		
		int c;
		c = a * b;
		
		return c;
		
	}
	
	public void div(int a, int b) {
		
		int c;
		c = a / b;
		
		System.out.println("Final answer is: "+c);
		
	}
	
	public static void main(String[] args) {
		
		Expressions jitender = new Expressions ();
		
		int plus_result = jitender.add(10, 2);
		int minus_result = jitender.sub(plus_result, 2);
		int plus_result1 = jitender.add(minus_result, 2);
		int multiply_result = jitender.mul(plus_result1, 2);
		jitender.div(multiply_result, 2);
		
	}
	
	
	
	
}
