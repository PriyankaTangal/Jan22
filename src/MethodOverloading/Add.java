package MethodOverloading;

public class Add {
	int a=10,b=5;
	void addition()
	{ 
		System.out.println(a+b);
	}
	void addition(int p)
	{
		int c=a+b+p;
		System.out.println(c);
	}
	void addition(float f)
	{
		float d=a+f;
		System.out.println(d);
	}
	static void addition(int p,int q,int r)
	{
		int s=p+q+r;
		System.out.println(s);
	}
}
