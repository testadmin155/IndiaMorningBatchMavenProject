package BankingProject.LoanDepartmnent;

import org.testng.annotations.Test;

public class CarLoan {
	
	@Test(groups={"Sanity"})
	public void CarLoanwithWeb()
	{
		System.out.println("CarLoanwithWeb");
	}

	@Test(groups={"Regression"})
	public void CarLoanwithAPP()
	{
		System.out.println("CarLoanwithAPP");
	}
	
	@Test(groups={"Regression"})
	public void CarLoanwithBranch()
	{
		System.out.println("CarLoanwithBranch");
	}
}