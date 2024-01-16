package testScrpitRepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ExcelUtility;
import genericutility.PropertiesUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PD001 extends BaseClass {
@Test(groups={"regression"})
	public  void testCase1() throws Exception 
	{
		ExcelUtility EUTIL = new ExcelUtility();
		String CATEGORY = EUTIL.getDataFromExcel("Promotion and Discount", 1, 1);
		String SLUG = EUTIL.getDataFromExcel("Promotion and Discount", 1, 2);
		driver.findElement(By.xpath("//span[text()='Promotions & Discounts']")).click();
		driver.findElement(By.xpath("//span[text()='Categories']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='Add']")).click();
		driver.findElement(By.id("basic_Name")).sendKeys(CATEGORY , Keys.TAB , SLUG);
		driver.findElement(By.id("basic_Type")).click();
		
//		WebElement element =driver.findElement(By.xpath("//div[text()='Others']"));
//		element.click();
//		Thread.sleep(6000);
//		element.submit();
		driver.findElement(By.xpath("//div[text()='Others']")).click();
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println("testcase1 successful");

	}

}
