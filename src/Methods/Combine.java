package Methods;

public class Combine {

	public static void main(String[] args) {
	System.out.println(add(5, 5));	
	
	Combine c=new Combine();
	System.out.println(c.sub(10, 7));

	
	}
	public static int add(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		return z;
	}

}
