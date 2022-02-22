package Casting;
public class Test
{
	public static void main(String[] args) {
		
		System.out.println("Typecast:Upcasting");
		Parent p1=new Child();
		p1.Home();
		
		System.out.println("Typecasting:Downcasting");
		
		Parent p2=new Child();
		Child c1=(Child)p2;
		c1.Home();	
	}
}