package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SEOPage 
{
@FindBy(xpath="//input[@placeholder='Reference Name']")
private WebElement referenceName;

@FindBy(xpath="//input[@placeholder='Slug']")
private WebElement slug;

@FindBy(xpath="//input[@placeholder='Seo Title']")
private WebElement seoTitle;

@FindBy(xpath="//button[text()='Filter']")
private WebElement filter;
public SEOPage(WebDriver driver)
{
	PageFactory.initElements( driver,this);
}

public WebElement getReferenceName() {
	return referenceName;
}

public WebElement getSlug() {
	return slug;
}

public WebElement getSeoTitle() {
	return seoTitle;
}

public WebElement getFilter() {
	return filter;
}

/**
 * this is a filter operation to by reference name 
 * @param refName
 * @throws InterruptedException 
 */
public void filterOperqation(String refName) throws InterruptedException
{
	referenceName.sendKeys(refName);
	Thread.sleep(3000);
	filter.click();
}
/**
 * this is a filter operation to by reference name and slug name
 * @param refName
 * @param slugName
 * @throws InterruptedException 
 */

public void filterOperqation(String refName, String slugName) throws InterruptedException
{
	referenceName.sendKeys(refName);
	slug.sendKeys(slugName);
	Thread.sleep(3000);
	filter.click();
	
}
/**
 * this is a filter operation to by reference name, slug name and seo title
 * @param refName
 * @param slugName
 * @param title
 */

public void filterOperqation(String refName, String slugName, String title)throws Exception
{
	referenceName.sendKeys(refName);
	slug.sendKeys(slugName);
	seoTitle.sendKeys(title);
	Thread.sleep(3000);
	filter.click();
	
}
}
