package Automation.Cucumber_StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScenarioOutLineStepDefination{
	public static WebDriver driver;
	
	@Given("launch the applicaton")
	public void launch_the_applicaton() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.get("https://nxtgenaiacademy.com/demo-site/");
	    System.out.println("launch the Application");
	}

	@When("register all deatils {string},{string},{string},{string}")
	public void register_all_deatils(String string, String string2, String string3, String string4) {
		driver.findElement(By.id("vfb-5")).sendKeys(string);
		driver.findElement(By.id("vfb-7")).sendKeys(string2);
		driver.findElement(By.id("vfb-31-1")).click();
		driver.findElement(By.id("vfb-14")).sendKeys(string3);
		driver.findElement(By.id("vfb-3")).sendKeys(string4);
		driver.findElement(By.id("vfb-4")).click();
		System.out.println("username and password are entered");
	    
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
	    driver.quit();
	    
	}
	@And("logout application")
	public void logout_applivation() {
		System.out.println("logout");
	}

}
