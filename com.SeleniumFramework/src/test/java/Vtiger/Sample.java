package Vtiger;

import org.testng.annotations.Test;

public class Sample {

	
	
	@Test
	public void createCustomerTest()
	{
		System.out.println("customer details created");
		int[]arr={1,2,3};
		System.out.println(arr[5]);
	}
	@Test(dependsOnMethods="createCustomerTest")
	public void modifyCustomerTest()
	{
		System.out.println("customer details modified");
	}
	@Test(dependsOnMethods="createCustomerTest")
	public void deleteCustomerTest()
	{
		System.out.println("customer details deleted");
	}
}
