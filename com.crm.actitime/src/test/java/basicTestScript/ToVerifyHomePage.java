package basicTestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMRepository.HomePage;
import POMRepository.LoginPage;
import POMRepository.TaskPage;
//binding states and behaviors in a classes is called as encapsulation

public class ToVerifyHomePage{
	@Test
	public void toVerifyHomePage (String[] args) throws InterruptedException {
		String expectedTitle = "Enter";
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage login = new LoginPage(driver);//to login
		login.loginAction("admin", "manager");
		
		WebDriverWait wait = new WebDriverWait(driver,20);//explicit wait to wait for server
		wait.until(ExpectedConditions.titleContains("Enter"));
				
		HomePage home = new HomePage(driver);//to get title
		String actualTitle= home.verifyTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Pass:The title is verified");
		
		home.clickOnTaskButton();
		
		TaskPage task = new TaskPage(driver);
		task.createCustomer("TestYantra123");
		
		String actualCustomerName =task.verifyCustomerName("TestYantra");
		
		System.out.println(actualCustomerName);
		
		home.logoutAction();//to logout
		driver.quit();
	}
}
