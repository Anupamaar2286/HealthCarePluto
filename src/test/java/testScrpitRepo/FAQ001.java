package testScrpitRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ExcelUtility;

public class FAQ001 extends BaseClass {
	@Test(groups= {"smoke","regression"})
	public void testCase3() throws Exception 
	{
		ExcelUtility EUTIL = new ExcelUtility();
		Thread.sleep(6000);
		String FAQCATEGORY = EUTIL.getDataFromExcel("FAQ Catagory", 1, 1);
		driver.findElement(By.xpath("//span[text()='FAQs Management']")).click();
		driver.findElement(By.xpath("//span[text()='FAQ-Category']")).click();
		driver.findElement(By.xpath("//span[text()='Add']")).click();
		driver.findElement(By.id("basic_Category")).sendKeys(FAQCATEGORY);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println("testCase3 is sucessfull");

	}

}
