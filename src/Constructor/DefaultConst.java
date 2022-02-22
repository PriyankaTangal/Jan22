package Constructor;


public class DefaultConst {
		int i;
		char c;
		String s;
		boolean b;
		double d;
		float f;	
		void display()
		{
			System.out.println(i);
			System.out.println(c);
			System.out.println(s);
			System.out.println(b);
			System.out.println(d);
			System.out.println(f);
		}	
		public static void main(String[] args)
		{
			DefaultConst dc=new DefaultConst();
			dc.display();
		}
	}
