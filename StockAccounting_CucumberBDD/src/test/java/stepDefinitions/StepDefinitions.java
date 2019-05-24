package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	 WebDriver driver;	
	
	@When("^I open the stockAccounting Url on chromeBrowser$")
	public void i_open_the_stockAccounting_Url_on_firefoxBrowser() throws Throwable {
	  
	   System.setProperty("webdriver.chrome.driver", "C:\\NewOJT\\StockAccounting_CucumberBDD\\ExecutableFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://webapp.qedge.com/login.php");
	}

	@When("^I enter admin in usernameField$")
	public void i_enter_admin_in_usernameField() throws Throwable {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
	}

	@When("^I enter password in passwordField$")
	public void i_enter_password_in_passwordField() throws Throwable {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
	}

	@When("^I click Login Button$")
	public void i_click_Login_Button() throws Throwable 
	{
	   driver.findElement(By.id("btnsubmit")).click();
	}

	@Then("^I should see logout link$")
	public void i_should_see_logout_link() throws Throwable 
	{
	    driver.findElement(By.id("logout")).click();
	}
}
