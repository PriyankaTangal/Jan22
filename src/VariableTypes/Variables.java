package VariableTypes;

public class Variables {
	int a=10; 				//global var/instance var
	String s="Priyanka";	
	static int i=100;		//static/class var
	
	public void m1()
	{
		int b;     //local var
		b=a+i;  //110
		System.out.println(b);
	}
	public static void m2()
	{
		int d; int e=50;
		d=e+i;
		System.out.println(d);
	}
}
