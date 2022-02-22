package AbstractClass;

public class Test {

	public static void main(String[] args) {
	Bank b=new PNB();
	Bank b1=new SBI();
	System.out.println("PNB ROI:"+b.getRateOfIntrest());
	System.out.println("SBI ROI:"+b1.getRateOfIntrest());
	Bank.details();
	}

}
