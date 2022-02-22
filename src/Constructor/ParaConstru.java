package Constructor;


public class ParaConstru {
	int i;
	String s;
	ParaConstru(int a,String b)
	{
		i=a;
		s=b;
	}
	void display()
	{
		System.out.println(i+" "+s);
	}
	public static void main(String[] args) {
		ParaConstru pc=new ParaConstru(1,"Priya");
		ParaConstru pc1=new ParaConstru(2,"Mahesh");
	    pc.display();
	    pc1.display();
	}
	

}
