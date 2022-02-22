package Constructor;

public class MultiCons {
	int a;
	int b;
	
	MultiCons()
	{
		a=10;
		b=5;
	}
	MultiCons(int x,int y)
	{
		a=x;
		b=y;
		int z=x*y;
	}
	MultiCons(float p,float q)
	{
		a=(int) (p*q);
		b=(int) (p+q);
	}
	public void add()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
	MultiCons mc1=new MultiCons();
	mc1.add();
	
	MultiCons mc2=new MultiCons(3.5f, 6.5f);
	mc1.add();
	
	MultiCons mc3=new MultiCons(5, 6);
	mc1.add();
	
	}	
}