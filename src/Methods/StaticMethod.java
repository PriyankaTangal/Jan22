package Methods;

import DiffPack.DiffPkgMethod;

public class StaticMethod {

	public static void main(String[] args) {
		m1();
		DiffClass.m2();
		DiffPkgMethod.m3();
	}
	public static void m1()
	{
		System.out.println("m1 static method running from same class ");
	}
}
