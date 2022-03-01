package AccessSpecifierdiffpkg;

import AccessSpecifier.As1;

public class Test extends As1
{
	public static void main(String[] args) {
	Test t=new Test();
	t.m1();
	t.m4();//protected with the help of child class obj red
}
}