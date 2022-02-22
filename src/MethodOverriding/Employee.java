package MethodOverriding;

public class Employee
{
	void SalCal()
	{
		System.out.println("salary calculate");
	}
}
class cleaner extends Employee
{
   void calSal()
   {
	   System.out.println("calcution of cleaner salary");
   }
}
class Manager extends Employee
{
	void calSal()
	{
		System.out.println("calculate of manager salary");
	}
}

	
