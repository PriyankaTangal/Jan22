package Methods;

public class ReturnTypeM {

	public static void main(String[] args) {
		int i=add();
		System.out.println(i);
		//System.out.println(add());
		ReturnTypeM rt=new ReturnTypeM();
		System.out.println(rt.sub());

	}
	public static int add()
	{
		int a = 5;
		int b =10;
		int c=a+b;
		return c;
	}
	public int sub()
	{
		int a = 15;
		int b =10;
		int c=a-b;
		return c;
	}
}
