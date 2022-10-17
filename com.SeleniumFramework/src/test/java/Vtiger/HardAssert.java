package Vtiger;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	
	@Test
public void createCustomer(){
	System.out.println("Step1");
	System.out.println("Step2");
	
    Assert.assertEquals("A", "B");
	System.out.println("Step3");
	System.out.println("Step4");
}

	
@Test

public void modifyCustomer(){
	System.out.println("--------------------");
	System.out.println("Step1");
	

	System.out.println("Step2");
	System.out.println("Step3");
}

}
