package String;

public class ImutableString {

	public static void main(String[] args) {
		String s="Sachin";
		//s.concat(" Tendulkar");  // String is immutable
		s=s.concat(" Tendulkar");  // Explicitlya assing ref var val
		System.out.println(s);
	}

}
