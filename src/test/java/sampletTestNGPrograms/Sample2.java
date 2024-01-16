package sampletTestNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;
/**
 * if we want to create a dependency in between methods we have to use "dependsOnMethod" 
 * We can use multiple methods in@test annotation argument
 * if we want to remove a test case from execution we have to use a method called a "enabled = false"
 * if we want tot execute a function multiple times we have to use a method called "InvocationCount"
 * if we want to pass any useful information in our report we have to use a static method named as"log(String) which is 
 * present in reporter clas"*/
public class Sample2 
{
	@Test(priority=1)// enabled = false)
	public void createUser()
	{
	System.out.println("create user");	
	}
	@Test(priority=2, dependsOnMethods ="createUser")
	public void modifyUser()
	{
		System.out.println("modify user");	
		Reporter.log("modify user depends on Create User");
	}@Test(priority=3, invocationCount=5)
	public void deleteUser()
	{
		System.out.println("delete user");	
	}
}
