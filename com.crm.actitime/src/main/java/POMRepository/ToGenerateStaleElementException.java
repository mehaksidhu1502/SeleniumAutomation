package POMRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//POM class StaleElementReferenceException
public class ToGenerateStaleElementException {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		driver.navigate().refresh();
//address changes when u refresh a page. This variable referece address has become old
//this problem occurs when we store address in reference variable and refresh the page
//this is solved by using POM class
		
		username.sendKeys("trainee");
	}
}
