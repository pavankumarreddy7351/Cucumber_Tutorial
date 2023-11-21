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

public class StepDefination2 {
	public static WebDriver driver;
	public static WebDriverWait wait;

	@Given("launchApplication")
	public void launch_application() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client/");
	    System.out.println("launch the Application");
	}

	@Then("username {string} and password {string}")
	public void username_and_password(String string, String string2) {
		driver.findElement(By.id("userEmail")).sendKeys(string);
		driver.findElement(By.id("userPassword")).sendKeys(string2);
		System.out.println("username and password are entered");
	}

	@When("click on sign-in")
	public void click_on_sign_in() {
	    
		driver.findElement(By.id("login")).click();
		System.out.println("sign button clicked");
	}

	@Then("get current url")
	public void get_current_url() {
	   System.out.println(driver.getTitle());
	}

	@And("logout")
	public void logout() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("i[class$='fa fa-sign-out']"))));
		
		driver.findElement(By.cssSelector("i[class$='fa fa-sign-out']")).click();
		System.out.println("logout the website");
		driver.quit();
	}



}
