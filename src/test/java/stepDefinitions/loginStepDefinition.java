package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinition {
	WebDriver driver;
	@Given("user present on Parabank login page")
	public void user_present_on_parabank_login_page() {
	    System.out.println("IO - user present on Parabank login page");
	    driver = new ChromeDriver();
	    driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	}

	
	@When("title of login page is ParaBank")
	public void title_of_login_page_is_para_bank() {
	    System.out.println(driver.getTitle());
	}

	@Then("user enters username {string} and User enters password {string}")
	public void user_enters_username_and_user_enters_password(String uname, String pass) {
	    System.out.println("IO - user enters username uname and User enters password pass");
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(pass);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
	    System.out.println("IO - user clicks on login button");
	    //Thread.sleep(2000);
	    ////*[@id="loginPanel"]/form/div[3]/input
	    driver.findElement(By.xpath("//*[@value=\"Log In\"]")).click();
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("IO - user is on home page");	    
	    System.out.println(driver.getTitle());
	}
	
}
