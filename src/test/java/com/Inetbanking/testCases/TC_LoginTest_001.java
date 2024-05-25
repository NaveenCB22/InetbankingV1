package com.Inetbanking.testCases;


import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.Inetbanking.pageObjects.LoginPage;

public final class TC_LoginTest_001 extends BaseClass{

		@Test
		public void loginTest() throws IOException {
			
			
			logger.info("URL is opened");
			LoginPage lp=new LoginPage(driver);
			
			lp.setUserName(username);
			logger.info("Entered UserName");
			
			lp.setPassword(Password);
			logger.info("Entered Password");
			
			lp.clickSubmit();
			logger.info("Successfully clicked submit button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login Test passed");
		}
		else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test failed");
		}
}
}