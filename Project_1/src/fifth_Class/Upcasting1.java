// Upcasting an Downcasting


package fifth_Class;

public class Upcasting1 extends Upcasting {
	
	public void display() {
		
		System.out.println("Hi, I am Child");
		
	}
	
	
	public static void main(String[] args) {
		
		Upcasting jiten = new Upcasting1();
		Upcasting1 jiten1 = (Upcasting1) jiten;  //downcasting 
		
		jiten1.display();
			
	}
	
}
