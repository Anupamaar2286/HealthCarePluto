package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
@FindBy(xpath="//span[text()='Dashboard Management']")
private WebElement dashBoard; 
@FindBy(xpath="//span[text()='Promotions & Discounts']")
private WebElement promotionsAndDiscounts;
@FindBy(xpath="//span[text()='Categories']")
private WebElement categories;
@FindBy(xpath ="//span[text()='Offers']")
private WebElement offers;

@FindBy(xpath="//span[text()='Banner Management']")
private WebElement bannerManagement;
@FindBy(xpath="//span[contains(text(),'New')]")
private WebElement whatsNew;
@FindBy(xpath="Test Management")
private WebElement testManagement;

@FindBy(xpath="//span[text()='Department Management']")
private WebElement departmentManagement;

@FindBy(xpath="//span[text()='FAQs Management']")
private WebElement faqsManagement;
@FindBy(xpath="//span[text()='FAQ-Category']")
private WebElement faqCategory;

@FindBy(xpath="//span[text()='FAQs']")
private WebElement faqs;
@FindBy(xpath="//span[text()='SEO Management']")
private WebElement seoManagement;
@FindBy(xpath="//span[text()='SEO']")
private WebElement seo;
@FindBy(xpath="//span[text()='Ticket Management']")
private WebElement ticketManagement;
@FindBy(xpath="//span[text()='HR Management']")
private WebElement hrManagement;
@FindBy(xpath="//span[text()='Logout']")
private WebElement logout;

public HomePage(WebDriver driver)
{
	PageFactory.initElements (driver,this);
}
/**
*this is a business library for Promotions And Discounts
*/
public void clickOnPromotionsAndDiscounts()
{
	promotionsAndDiscounts.click();
}
/**
*this is a business library for Categories in Promotions And Discounts
*/

public void clickOnPromotionsAndDiscountsWithCategories()
{
	promotionsAndDiscounts.click();
	categories.click();
}
/**
*this is a business library for Offers in Promotions And Discounts
*/

public void clickOnPromotionsAndDiscountsWithOffers()
{
	promotionsAndDiscounts.click();
	offers.click();
}
/**
*this is a business library for  Department Management
*/
public void clickOnDepartmentManagement()
{
	departmentManagement.click();
	
}
/**
*this is a business library for  FAQS Management
*/
public void clickOnFaqsManagement()
{
	faqsManagement.click();
}
/**
*this is a business library for FAQ Category in FAQS Management
*/
public void clickOnFaqCategory()
{
	faqsManagement.click();
	faqCategory.click();
}
/**
*this is a business library for FAQS in FAQS Management
*/
public void clickOnFaqs()
{
	faqsManagement.click();
	faqs.click();
}
/**
*this is a business library for SEO Management
*/
public void clickSeoManagement()
{
	seoManagement.click();
}
/**
*this is a business library for SEO
*/
public void clickSeo()
{
	seoManagement.click();
	seo.click();
}/**
*this is a business library for logout
*/
public void clickLogout()
{
	logout.click();
}
}














