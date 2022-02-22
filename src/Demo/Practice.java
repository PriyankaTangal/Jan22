package Demo;

public class Practice
{ 
	int id;
	String name;
	int age;
	Practice()
	{
		id=1;
		name="sam";
		age=17;
	}
	Practice(int i,String n)
	{
		id=i;
		name=n;
	}
	Practice(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+age+" ");
	}
	public static void main(String[] args) {
		Practice p2=new Practice();
		Practice p=new Practice(1,"Priya");
		Practice p1=new Practice(2,"Mahesh",34);
		p.display();
		p1.display();
		p2.display();
	}
}

