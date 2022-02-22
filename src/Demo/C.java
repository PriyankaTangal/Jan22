package Demo;

public class C extends P{
	int a=100;
	int p=2;
	
	public void display()
	{
		int a=10;
		int p=3;
		System.out.println("local a:"+a);
		System.out.println("local p:"+p);
		
		System.out.println("gloabal a for same class:"+this.a);
		System.out.println("gloabal p for same class:"+this.p);
		
		System.out.println("gloabal a for diff/parent/super class:"+super.a);
		System.out.println("gloabal p for diff/parent/super class:"+super.p);
		
		
	}
	public static void main(String[] args) {
		C c=new C();
		c.display();
	}

}
