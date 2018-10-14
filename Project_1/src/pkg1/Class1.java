//  2 Methods 2 Variables and 2 Objects & calling of method with object

package pkg1;

public class Class1 {
	
	public void age(int a) {
		
		System.out.println("Age is: "+a);
		
	}
	
	public void roll_num(int a) {
		
		System.out.println("Roll Number is: "+a);
		
	}
	
	
	public static void main(String[] args) {
		
		Class1 Jitender = new Class1();
		Class1 Prateek = new Class1();
		
		Jitender.age(28);
		Jitender.roll_num(1001);
		
		Prateek.age(28);
		Prateek.roll_num(1002);
		
	}
	

}
