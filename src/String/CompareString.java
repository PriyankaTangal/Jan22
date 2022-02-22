package String;

public class CompareString {

	public static void main(String[] args) {
		String s1="priyanka";
		String s2="Priyanka";
		String s3=new String("Mahesh");
		String s4=new String("mahesh");
		String s5="Priyanka";
		String s6="rangal";

		System.out.println(s1==s2);  // false--case different so create another object
		System.out.println(s2==s5);  // true--checking referance value
		System.out.println(s1.equals(s2));//false--case not same
		System.out.println(s1.equalsIgnoreCase(s2));//true---ignore case
		System.out.println(s3==s4); //false--use new keyword so create new obj for both
		System.out.println(s3.equals(s4));//false----case not match
		System.out.println(s3.equalsIgnoreCase(s4)); //true----ignore case
		
		System.out.println(s2.compareTo(s5));  //equals=0
		System.out.println(s1.compareTo(s6));  //s1>s6= -2
		System.out.println(s6.compareTo(s1));  //s6<s1= 2
	}

}
