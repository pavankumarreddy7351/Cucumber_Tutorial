package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
public static Actions action;
public static WebDriverWait wait;
public static ChromeOptions options;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		options=new ChromeOptions();
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		action=new Actions(driver);
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
}
