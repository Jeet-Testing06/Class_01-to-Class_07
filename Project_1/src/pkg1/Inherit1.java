//Single Level

package pkg1;

public class Inherit1 extends Inherit{
	
	public void son(int a, int b, int c) {
		int d;
		
		d = a + b + c;
		
		System.out.println(d);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Inherit1 jiten = new Inherit1();
		jiten.son(1, 1, 1);
		jiten.Dad(1, 1);
		
		
	}
	
	

}
