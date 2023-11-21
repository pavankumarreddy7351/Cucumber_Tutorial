package Automation.Cucumber_StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPage {
	public static WebDriver driver;
	@Given("launch the application")
	public void launch_the_application() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://nxtgenaiacademy.com/demo-site/");
	    driver.manage().window().maximize();
	    
	}

	@When("enter registeration deatils")
	public void enter_registeration_deatils(io.cucumber.datatable.DataTable dataTable) {
	    
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> data=dataTable.asLists();
		
		System.out.println(data.get(1).get(0));
		driver.findElement(By.id("vfb-5")).sendKeys(data.get(1).get(0));
		driver.findElement(By.id("vfb-7")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("vfb-31-1")).click();
		driver.findElement(By.id("vfb-14")).sendKeys(data.get(1).get(3));
		driver.findElement(By.id("vfb-3")).sendKeys(data.get(1).get(4));
	    
	}

	@Then("click on submite button")
	public void click_on_submite_button() {
	    
	    driver.findElement(By.id("vfb-4")).click();
	}

	@And("close the application")
	public void close_the_application() {
	    
	    driver.quit();
	}

}
