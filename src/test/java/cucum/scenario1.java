package cucum;

 
import java.util.concurrent.TimeUnit;

 
import org.junit.Assert;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;

 
import cucumber.api.java.en.Given;
 
import cucumber.api.java.en.Then;
 
import cucumber.api.java.en.When;

 
public class scenario1 {
 
WebDriver driver;

 
@Given("user opens newtours application on chrome browser")
 
public void user_opens_newtours_application_on_chrome_browser() {
 
System.setProperty("webdriver.chrome.driver","C:\\New_NextGen_Testing_Software\\slenium\\chromedriver.exe");
 
driver= new ChromeDriver();
 
driver.get("http://newtours.demoaut.com");


}

 
@When("user enters {string} in username and password field")
 
public void user_enters_mercury_in_username_and_password_field(String string) {
 
driver.findElement(By.name("userName")).sendKeys("mercury");
 
driver.findElement(By.name("password")).sendKeys("mercury");

}

 
@When("click on SignIn button")
 
public void click_on_SignIn_button() {
 
driver.findElement(By.name("login")).click();

}
@Then("verify login result")

public void verify_login_result() {
 
Assert.assertTrue(driver.getTitle().contains("Flight"));
 
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
driver.close();

}




}
