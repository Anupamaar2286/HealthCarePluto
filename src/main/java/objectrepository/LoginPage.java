package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement signInButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	/**
	 * this is the business library to perform loginoperation
	 * @param user
	 * @param pass
	 * */
	
	public void loginOperation(String user, String pass)
	{
		userName.sendKeys(user);
		password.sendKeys(pass);
		signInButton.click();
		
	}
}
