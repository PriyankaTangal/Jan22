package String;

public class StringManupulation {

	public static void main(String[] args) {
		String s="The rains have started here";
		String s1="The rains Have started here";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('s'));  //1st occurance
		System.out.println(s.indexOf('s',s.indexOf('s')+1)); //second occurance
		System.out.println(s.indexOf("have"));
		System.out.println(s.indexOf("hello")); //-1
		//string comparision
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		//substring
		System.out.println(s.substring(0, 9));
		//trim
		String s2="       Priya Tangal        ";
		System.out.println(s2.trim());
		//replace space
		System.out.println(s2.replace(" ",""));
		String s3="01-01-2022";
		System.out.println(s3.replace("-","/"));
		
		//split
		String s4="Hellow_world_test_selenium";
		String[] testval=s4.split("_");
		for(int i=0;i<testval.length;i++)
		{
			System.out.println(testval[i]);
		}
		//concat
		String s5="cares";
		System.out.println(s5.concat("s"));
	}

}
