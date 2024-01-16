package sampletTestNGPrograms;

import org.testng.annotations.Test;
/***
 * @Test is mandatory for all the test cases otherwise it will not consider as test case
 * @
 * */
public class SampleTestNGMethod 
{
	@Test(priority=1)
	public void createUser()
	{
	System.out.println("create user");	
	}
	@Test(priority=2)
	public void modifyUser()
	{
		System.out.println("modify user");	
	}@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("delete user");	
	}
}
