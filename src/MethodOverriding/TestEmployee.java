package MethodOverriding;

public class TestEmployee {
	public static void main(String[] args) {
		cleaner c=new cleaner();
		c.calSal();
		Manager m=new Manager();
		m.calSal();
	}
}
