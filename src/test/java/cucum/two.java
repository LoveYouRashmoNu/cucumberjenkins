package cucum;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class two {
	WebDriver driver;
	@Given("user opens the application in chrome browser")
	public void user_opens_the_application_in_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\New_NextGen_Testing_Software\\slenium\\chromedriver.exe");
		 
		driver= new ChromeDriver();
		 
		driver.get("http://newtours.demoaut.com");
	}

	@When("user enters {string} as username and {string} as password")
	public void user_enters_as_username_and_as_password(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		 
		driver.findElement(By.name("password")).sendKeys(string2);

	}

	@When("click on Login button")
	public void click_on_Login_button() {
		driver.findElement(By.name("login")).click();

	}

	@Then("verify the results")
	public void verify_the_results() {
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.close();
	}



}
