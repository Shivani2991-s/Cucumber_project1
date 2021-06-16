package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Stepdefinition {
	WebDriver driver;
	@Given("User is already on login Page")
	public void user_is_already_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	}

	@When("The user enter the username")
	public void the_user_enter_the_username() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.cssSelector("[id='email']")).sendKeys("admin");
	}

	@When("The user enter the password")
	public void the_user_enter_the_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("admin123");
	}
	

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	

	@Then("User Home page is populated")
	public void user_home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.close();
	}
	@Given("User is already on the login page")
	public void user_is_already_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	

	@When("User login into application with {string} and {string}")
	public void user_login_into_application_with_and(String uname, String pass) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("[id='email']")).sendKeys(uname);
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys(pass);
		driver.findElement(By.cssSelector("[type='submit']")).click();

	}
    
}
