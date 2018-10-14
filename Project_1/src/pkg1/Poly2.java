// Dynamic Polymorphism - overriding

package pkg1;

public class Poly2 extends Poly1 {
	
	public int add(int x, int y) {
		int z;
		z = x * y;
		return z;
		
		
	}
	
public static void main(String[] args) {
		
		Poly2 jiten = new Poly2();
		int result = jiten.add(2, 3);
		System.out.println(result);
		
		
		
	}
	

}
