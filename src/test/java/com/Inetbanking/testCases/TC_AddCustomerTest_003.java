package com.Inetbanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.Inetbanking.pageObjects.AddCustomerPage;
import com.Inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(Password);
		logger.info("Password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		
		logger.info("Providing custmer detail");
		
		addcust.custName("Naveen");
		addcust.custgender("male");
		addcust.custdate("10", "02", "1996");
		Thread.sleep(3000);
		addcust.custaddress("Gangimadi");
		addcust.custcity("Gadag");
		addcust.custstate("Karnataka");
		addcust.custpincode("582101");
		addcust.custtelephone("9902970428");
		String email=randomstring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		Thread.sleep(3000);
		
		logger.info("Validation is started");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("Testcases is passed");
		}
		else {
			logger.info("Testcases is failed");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);

		}
	}
	
	public String randomstring() {
	String generatedstring=	RandomStringUtils.randomAlphabetic(5);
	return(generatedstring)	;
	}
	
	public String randomnum() {
		String generatedstring2=	RandomStringUtils.randomNumeric(4);
		return(generatedstring2)	;
		}
}
