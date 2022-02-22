package ThisSuper;

public class Child extends Parent
{
	int a=100;
	int b=200;
	int r=25;
	public void m1()
	{
		int a=10;
		int b=20;
		int q=20;
		System.out.println("local "+a);
		System.out.println("local "+b);
		System.out.println("local "+q);
		System.out.println("Global from same class "+this.a);
		System.out.println("Global from same class "+this.b);
		System.out.println("Global from super class "+super.a);
		System.out.println("Global from super class "+super.b);
	}
}
