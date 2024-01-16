package genericutility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.HomePage;
import objectrepository.LoginPage;
/**
 * this a base class to keep all the common features
 */

public class BaseClass 
{
	public static WebDriver driver=null;
	public PropertiesUtility PUTIL= new PropertiesUtility();
@BeforeSuite(alwaysRun=true)
public void dbConnection()
{
	System.out.println("Db conncection successfull");
}
@BeforeClass(alwaysRun=true)
public void launchBrowser() throws Exception
{
	String URL = PUTIL.getDataFromProperties("url");
	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Folder\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(URL);
	System.out.println("Browser launched");
}
@BeforeMethod(alwaysRun=true)
public void loginApplication() throws Exception
{
	String USERNAME = PUTIL.getDataFromProperties("username");
	String PASSWORD = PUTIL.getDataFromProperties("password");
	LoginPage login = new LoginPage(driver);
	login.loginOperation(USERNAME, PASSWORD);
	System.out.println("login successfull");
}
@AfterMethod(alwaysRun=true)
public void logoutAppliaction()
{
	//driver.findElement(By.xpath("//span[text()='Logout']")).click();
	HomePage hp = new HomePage(driver);
	hp.clickLogout();
	System.out.println("logout successfull");
}
@AfterClass(alwaysRun=true)
public void closeBrowser()
{
	driver.quit();
	System.out.println("Close browser");
}
@AfterSuite(alwaysRun=true)
public void closeDbConnection()
{
	System.out.println("Db connectin closed");
}
}