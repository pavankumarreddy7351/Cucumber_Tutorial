package BaseClass;

import Automation.Cucumber_StepDefination.StepDefination2;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static StepDefination2 s;
	@Before
	public void setUp() {
		System.out.println("Excuted");
		s=new StepDefination2();
		s.launch_application();
		
		
	}
	@After
	public void tearDown() {
		s.logout();
		System.out.println("Excution completed");
	}
	@Before("@Smoke")
	public void setUpSmoke() {
		System.out.println("Excuted");
		s=new StepDefination2();
		s.launch_application();
		
		
	}
	@After("@Smoke")
	public void tearDownSmoke() {
		s.logout();
		System.out.println("Excution completed");
	}


}
