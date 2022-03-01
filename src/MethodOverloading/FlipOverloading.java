package MethodOverloading;

public class FlipOverloading {
	public void addItemtoCart(int a)
	{
		System.out.println("i added kurti and qty is="+a);
	}
	public void addItemtoCart(int a,String s)
	{
		System.out.println("i added kurti and salvar qty is="+a+" "+s);
		
	}
	public void addItemtoCart()
	{
		System.out.println("i added 1 laptop in cart");
	}
	public static void main(String[] args) {
		FlipOverloading fo=new FlipOverloading();
		fo.addItemtoCart();
		fo.addItemtoCart(2);
		fo.addItemtoCart(2, "combo");
	}
}
