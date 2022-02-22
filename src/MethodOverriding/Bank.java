package MethodOverriding;

public class Bank 
{
	void getRateOfInterest()
	{
		System.out.println("Body of calculate rateOfInterest");
	}
}

	class SBI extends Bank
	{
		void getRateOfInterest()
		{
		System.out.println("SBI rateOfInterest 8%");
		}
	}
	class ICICI extends Bank
	{
		void getRateOfInterest()
		{
			System.out.println("ICICI rateOfInterest 7%");
		}
	}
	class Axix extends Bank
	{
		void getRateOfInterest()
		{
			System.out.println("Axix rateOfInterest 9%");
		}
	}

