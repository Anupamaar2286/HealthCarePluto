package testScrpitRepo;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ExcelUtility;
import objectrepository.DepartmentManagementAddPage;
import objectrepository.DepartmentManagementPage;
import objectrepository.HomePage;

public class DM001 extends BaseClass
{
	
@Test//(groups = {"smoke"}, retryAnalyzer = genericutility.RetryAnalyzerImplementationClass.class)
	public void testCase2() throws Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
		String DEPARTMENTNAME = EUTIL.getDataFromExcel("Department Management", 1, 1);
		Thread.sleep(6000);
		HomePage hp = new HomePage(driver);
		hp.clickOnDepartmentManagement();
		DepartmentManagementPage dhp = new DepartmentManagementPage(driver);
		dhp.clickOnAdd();
		DepartmentManagementAddPage dmap = new DepartmentManagementAddPage(driver);
		dmap.submitByActive(DEPARTMENTNAME);
//		driver.findElement(By.xpath("//span[text()='Department Management']")).click();
//		driver.findElement(By.xpath("//span[text()='Ad']")).click();
//		driver.findElement(By.id("basic_DepartmentName")).sendKeys(DEPARTMENTNAME);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		System.out.println("testCase2 is sucessfull");
		Thread.sleep(6000);
	}

}
