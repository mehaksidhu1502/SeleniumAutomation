package POMRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//@FindBy is an annotation.Annotation is a java template.
//It fetches info from somewhere and feeds info either to a variable or to a method.

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")//it should be unique.This will identify the address.
	WebElement usernameTextField;//store in relevant variable name
	
	@FindBy(name = "pwd")
	WebElement passwordTextField;
	
	@FindBy(xpath = "//div[text()='Login ']")
	WebElement loginButton;
	
	public void loginAction(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
	}
	
	
}
