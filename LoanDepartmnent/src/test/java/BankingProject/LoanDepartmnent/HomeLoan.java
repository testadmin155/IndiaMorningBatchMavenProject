package BankingProject.LoanDepartmnent;

import org.testng.annotations.Test;

public class HomeLoan {
	
	@Test(groups={"Regression"})
	public void HomeLoanwithWeb()
	{
		System.out.println("HomeLoanwithWeb");
	}

	@Test(groups={"Sanity"})
	public void HomeLoanwithAPP()
	{
		System.out.println("HomeLoanwithAPP");
	}
	
	@Test
	public void HomeLoanwithBranch()
	{
		System.out.println("HomeLoanwithBranch");
	}
}
