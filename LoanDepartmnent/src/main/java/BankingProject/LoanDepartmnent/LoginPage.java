package BankingProject.LoanDepartmnent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(id = "loginBtn")
	WebElement loginbtn;
	
	//ForgetPassword
	
	//Signup
	
	//Remember Checkbox
	
	public void login() throws InterruptedException
	{
		email.sendKeys("automationtestacademy@gmail.com");
		password.sendKeys("Test@9999");
		loginbtn.click();
		Thread.sleep(3000);
	}

}
