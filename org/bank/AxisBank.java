package org.bank;

public class AxisBank extends BankInfo{
	public void deposit()
	{   
				System.out.println("We at Axis Bank offer only 7% interest");
	}
	
	public void ThisandSuper()
	{
		System.out.println("The below are the output of method ThisandSuper --1st is output of this and 2nd is output of super");
		{
			this.deposit();
			super.deposit();
		}
	}
	
	
public static void main(String[] args) {

	AxisBank ab= new AxisBank();
	System.out.println("The below is the ouput of overriden method");
	System.out.println("");
	ab.deposit();
	ab.ThisandSuper();
	
		
}
}
