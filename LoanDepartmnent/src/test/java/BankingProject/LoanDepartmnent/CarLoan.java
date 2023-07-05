package BankingProject.LoanDepartmnent;

import java.io.IOException;

import org.testng.annotations.Test;

public class CarLoan extends ReadDataFromExcel{
	
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
	public void CarLoanwithBranch() throws IOException
	{
		getData("TypeofTraining","TestComplete");
	}
}
