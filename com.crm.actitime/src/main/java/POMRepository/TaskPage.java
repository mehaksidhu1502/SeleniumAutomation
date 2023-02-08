package POMRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	WebDriver driver;
	
	public TaskPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver= driver;
	}
	
	//addNewButton
	@FindBy(xpath = "//div[text()='Add New']")
	WebElement addNewButton ;
	
	//newCustomerButton
	@FindBy(xpath = "//div[text()='+ New Customer']")
	WebElement newCustomerButton;
	
	//newCustomerButton
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name'])[2]")
	WebElement enterCustomerNameTextField;
	
	//createCustomerButton
	@FindBy(xpath = "//div[text()='Create Customer']")
	WebElement createCustomerButton;
	
	
	public void createCustomer(String customerName) throws InterruptedException {
		addNewButton.click();
		newCustomerButton.click();
		Thread.sleep(2000);
		enterCustomerNameTextField.sendKeys(customerName);
		createCustomerButton.click();
	}
	
	public String verifyCustomerName(String customerName){
		return driver.findElement(By.xpath("//div[contains(@title,\""+customerName+"\")]")).getText();
	}
	
}
