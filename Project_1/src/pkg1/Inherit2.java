//multilevel
// comment out is hierarchichal inheritance

package pkg1;

public class Inherit2 extends Inherit1 {
//public class Inherit2 extends Inherit {
	
	public void son1(int a, int b , int c, int d) {
		int e;
		e = a + b + c + d;
		System.out.println(e);
		
	}
	
	
	public static void main(String[] args) {
		Inherit2 jiten = new Inherit2();
		jiten.son1(1, 1, 1, 1);
		jiten.son(1, 1, 1);
		jiten.Dad(1, 1);
		
		//jiten.son1(1, 1, 1, 1);
		//jiten.Dad(1, 1);
		
		
	}
	
	
	
	
	

}
