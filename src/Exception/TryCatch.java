package Exception;

public class TryCatch {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int div;
		int sum;
		
		try
		{
			div=a/b;
			System.out.println(div);
		}
		catch(ArithmeticException e)
		{
			System.out.println("do not divide with zero val:");
		}
		sum=a+b;
		System.out.println(sum);
	}

}
