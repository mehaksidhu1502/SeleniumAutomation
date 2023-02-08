package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	@FindBy(id ="container_tasks")
	WebElement taskButton;
	
	@FindBy(linkText = "Logout")
	WebElement logoutLink;
	
	public String verifyTitle()	{
		return driver.getTitle();
	}
	
	public void clickOnTaskButton() {
		taskButton.click();
	}
	
	public void logoutAction() {
		logoutLink.click();
	}
}
