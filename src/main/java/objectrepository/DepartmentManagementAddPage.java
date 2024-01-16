package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentManagementAddPage 
{
	@FindBy(xpath="//input[@placeholder='Department Name']")
	private WebElement departmentName;
	
	@FindBy(xpath="//span [@class='ant-select-selection-item']")
	private WebElement status;
	
	@FindBy(xpath="//span [text()='Active']")
	private WebElement activeStatus;
	
	@FindBy(xpath="//span [text()='Inactive']")
	private WebElement inactiveStatus;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
	public DepartmentManagementAddPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getDepartmentName() {
		return departmentName;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getActiveStatus() {
		return activeStatus;
	}

	public WebElement getInactiveStatus() {
		return inactiveStatus;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public void submitByActive(String name)
	{
		departmentName.sendKeys(name);
		status.click();
		activeStatus.click();
		submit.click();
		
	}
	public void submitByInActive(String name)
	{
		departmentName.sendKeys(name);
		status.click();
		submit.click();
		
	}
}
