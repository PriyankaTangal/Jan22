package DecisionMaking;

public class NestefIfElse {
	public static void main(String[] args) {
		int age=46;
		String gender="male";
		if(age>=18 && age<60)
		{
			System.out.println("valid voter");
				if(age>=21 && gender.equals("male"))
			    {
				System.out.println("valid for marrige");
					if(age>=18 && age<=45)
					{
						System.out.println("valid for govt exam");
					}
					else
					{
						System.out.println("invalid for govt exam");
					}
			    }
			    else
			    {
			    	System.out.println("invalid for marraige");
			    }
		}
		else
		{
			System.out.println("invalid voter");
		}
						
	}
}
