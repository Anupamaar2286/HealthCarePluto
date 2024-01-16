package sampletTestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsertClass 
{
	@Test
public void hardAssertStrictComaprison()
{
	String expectedValue ="raja";
	String actualValue = "Raja";
	Assert.assertEquals(actualValue, expectedValue);
	System.out.println("Assertion passed!");
}
	@Test
	public void hardAssertContainsComaprison()
	{
		String expectedValue ="Maharaja";
		String actualValue = "Raja";
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("Contains passed!");
	}
}
