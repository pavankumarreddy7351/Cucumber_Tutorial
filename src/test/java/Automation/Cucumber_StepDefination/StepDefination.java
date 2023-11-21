package Automation.Cucumber_StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	public static WebDriver driver;
	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client/");
	    System.out.println("launch the Application");
	}

	@When("enter username and password")
	public void enter_username_and_password() {
		driver.findElement(By.id("userEmail")).sendKeys("pavan4331@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("*Pavan@4331");
		System.out.println("username and password are entered");
	}

	@When("click on sign button")
	public void click_on_sign_button() {
		driver.findElement(By.id("login")).click();
		System.out.println("sign button clicked");
	}

	@Then("Website homepage should be launched")
	public void website_homepage_should_be_launched() {
		System.out.println("homepage launched");
	}

	@And("logout the website")
	public void logout_the_website() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("i[class$='fa fa-sign-out']"))));
		
		driver.findElement(By.cssSelector("i[class$='fa fa-sign-out']")).click();
		System.out.println("logout the website");
	}

	@And("close Application")
	public void close_application() {
		System.out.println("close the application");
		driver.quit();
	}
	@When("enter invaild_username and invaild_password")
	public void enter_invaild_username_and_invaild_password() {
		driver.findElement(By.id("userEmail")).sendKeys("4331@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("*Pavan@4331");
		System.out.println("username and password are entered");
	}

	@Then("Website homepage should not be launched")
	public void website_homepage_should_not_be_launched() {
	    System.out.println("website not opened");
	}



}
