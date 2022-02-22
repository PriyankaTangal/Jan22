package MethodOverriding;

public class TestBank extends Bank {

	public static void main(String[] args) {
		SBI s1=new SBI();
		s1.getRateOfInterest();
		ICICI i=new ICICI();
		i.getRateOfInterest();
		Axix a=new Axix();
		a.getRateOfInterest();
		

	}

}
