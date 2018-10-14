//Static Polymorphism

package pkg1;

public class Poly {
	
	public void sum(int a, int b) {
		int c;
		c= a + b;
		System.out.println(c);
		
	}
	
	public void sum(int a, int b, int c) {
		int d;
		d= a + b + c;
		System.out.println(d);
		
	}
	
	public static void main(String[] args) {
		Poly jiten = new Poly();
		jiten.sum(1, 1);
		jiten.sum(1, 1, 1);
		
		
		
	}
	

}
