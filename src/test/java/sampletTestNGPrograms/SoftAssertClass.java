package sampletTestNGPrograms;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass 
{
	@Test
	public void softAssertComparision()
	{
		String actualValue = "raja";
		String expectedValue = "Raja";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(expectedValue,actualValue);
		System.out.println("soft assert hard comparison passed!");
		sa.assertAll();
	}
	@Test
	public void softContainsStrictComparision()
	{
		String actualValue = "Maharaja";
		String expectedValue = "raja";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(expectedValue.contains(actualValue));
		System.out.println("soft assert contains comparison passed!");
		sa.assertAll();
	}
}
