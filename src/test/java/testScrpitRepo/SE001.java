package testScrpitRepo;

import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ExcelUtility;
import objectrepository.HomePage;
import objectrepository.SEOPage;

public class SE001 extends BaseClass
{
	@Test
	public void filterOption() throws Exception
	{
		ExcelUtility EUTIL = new ExcelUtility();
		String REFERENCENAME = EUTIL.getDataFromExcel("SEO", 1, 1);
		String SLUGNAME = EUTIL.getDataFromExcel("SEO", 1, 2);
		String SEOTITLE = EUTIL.getDataFromExcel("SEO", 1, 3);
		
		HomePage hp = new HomePage(driver);
		hp.clickSeo();
		
		SEOPage sp = new SEOPage(driver);
		sp.filterOperqation(REFERENCENAME);
		Thread.sleep(6000);
		
		
		
	}
}
