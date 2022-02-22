package Casting;

public class PrimitiveImplicitExplicit {

	public static void main(String[] args) {
		//implicit casting
		
		byte b=10;
		int c;
		c=b;
		System.out.println(c);
		b=(byte) c;
		System.out.println(b);

	}

}
