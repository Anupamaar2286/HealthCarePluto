package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentManagementPage 
{
	@FindBy(xpath="//span[text()='Add']")
	private WebElement add;
	
	public DepartmentManagementPage(WebDriver driver)
	{
		PageFactory.initElements (driver,this);
	}

	public WebElement getAdd() {
		return add;
	}
	public void clickOnAdd()
	{
		add.click();
	}
}

