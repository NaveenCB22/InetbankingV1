package com.Inetbanking.testCases;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

import com.Inetbanking.pageObjects.EditCustomerform;
import com.Inetbanking.pageObjects.LoginPage;

public class TC_EditcustomerformTest_004 extends BaseClass
{
@Test
public void Editcustomer() throws InterruptedException {
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("User is provided");
	lp.setPassword(Password);
	logger.info("Password is provided");
	lp.clickSubmit();
	
	Thread.sleep(3000);
	
	logger.info("Editing customer details provided");
	EditCustomerform editcust=new EditCustomerform(driver);
	editcust.clickEditCustomer();
	editcust.seteditcustomer("64791");
	editcust.clickEditFormSubmit();
	editcust.Editaddress("Gangimadi1237");
	editcust.cust1submit();
	
}
	

}

