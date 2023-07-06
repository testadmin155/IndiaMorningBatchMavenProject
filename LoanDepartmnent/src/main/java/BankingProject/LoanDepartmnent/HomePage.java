package BankingProject.LoanDepartmnent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest{
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//driver.findElement(By.id("code")).sendKeys("999999");
	@FindBy(id = "code")
	WebElement code;
	
	public void EnterCode()
	{
		code.sendKeys("999999");
	}

}