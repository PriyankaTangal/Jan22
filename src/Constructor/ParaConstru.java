package Constructor;


public class ParaConstru {
	int id;
	String name;
	ParaConstru(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		ParaConstru pc=new ParaConstru(1,"Priya");
		ParaConstru pc1=new ParaConstru(2,"Mahesh");
	    pc.display();
	    pc1.display();
	}
	

}
