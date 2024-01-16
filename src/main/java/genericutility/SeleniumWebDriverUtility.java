package genericutility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class SeleniumWebDriverUtility 
{
	/**
	 * this method is used to maximize the browser
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * select option in a dropdown based on index
	 * @param element
	 * @param indexNum
	 */
	public void selectOptionFromDropDown(WebElement element, int indexNum)
	{
		Select s = new Select(element);
		s.selectByIndex(indexNum);
	}
	
	/**
	 * select option in a drop down based on value
	 * @param element
	 * @param value
	 */
	public void selectOptionFromDropDown(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	/**
	 * select option in a drop down based on visible text
	 * @param element
	 * @param value
	 */
	public void selectOptionFromDropDownBasedOnVisibleText(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	/**
	 * move an element
	 * @param driver
	 * @param element
	 */
	public void movingToanElement(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * right click on an element
	 * @param driver
	 * @param element
	 */
	public void rigthClickOnAnElement(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
		
	}
	/**
	 * this method is to perform drag and drop
	 * @param driver
	 * @param src
	 * @param target
	 */
	
	public void dragAndDropOperation(WebDriver driver, WebElement src, WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	/**
	 * this method is used to accept an alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	/**
	 * this method is used to reject an alert message
	 * @param driver
	 */
	public void rejectAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	/**
	 * this method is used to fetch all the alert messages
	 * @param driver
	 * @return
	 */
	public String fetchAlertMsg(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		String alertmsg = alt.getText();
		return alertmsg;
	}
	
}
