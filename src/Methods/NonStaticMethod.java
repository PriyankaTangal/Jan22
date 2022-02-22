package Methods;

import DiffPack.DiffPkgMethod;

public class NonStaticMethod {

	public static void main(String[] args) {
		NonStaticMethod sc=new NonStaticMethod();
		sc.meth1();
	    
		DiffClass dc=new DiffClass();
		dc.meth2();
		
		DiffPkgMethod dp=new DiffPkgMethod();
		dp.meth3();
	}
	public void meth1()
	{
		System.out.println("meth1 non static method running from same class");
	}

}
