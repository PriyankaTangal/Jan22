package MethodOverloading;

public class AddTest {

	public static void main(String[] args) {
		Add a=new Add();
		a.addition();
		a.addition(5);
		a.addition(2.5f);
		Add.addition(5, 5, 5);
	}
}
