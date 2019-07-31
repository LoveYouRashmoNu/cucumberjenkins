package cucum;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class tags {
	WebDriver driver;
	@Given("user opens chrome for newtours app")
	public void user_opens_chrome_for_newtours_app() {
		System.setProperty("webdriver.chrome.driver","C:\\New_NextGen_Testing_Software\\slenium\\chromedriver.exe");
		 
		driver= new ChromeDriver();
		 
		driver.get("http://newtours.demoaut.com");

	}

	@When("user types {string} as username and {string} as password")
	public void user_types_as_username_and_as_password(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		 
		driver.findElement(By.name("password")).sendKeys(string2);
	}

	@Given("click signin button")
	public void click_signin_button() {
		driver.findElement(By.name("login")).click();
	 
	}

	@Given("verify the result")
	public void verify_the_result() {
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.close();

	}


}
