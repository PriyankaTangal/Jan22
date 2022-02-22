package Exception;

public class MultiCatch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		try
		{
			System.out.println(arr[2]/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please enter size less than array size");
		}
		catch(ArithmeticException e)
		{
			System.out.println("do not divide with zero val");
		}
		System.out.println(arr[1]+arr[2]);
	}

}
