package com.Inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class EditCustomerform {
WebDriver ldriver;

public EditCustomerform(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(how=How.XPATH, using="//a[@href='EditCustomer.php']")
@CacheLookup
WebElement EditCustomer;

@FindBy(how=How.NAME, using="cusid")
@CacheLookup
WebElement txtCustomerID;

@FindBy(how=How.NAME, using="AccSubmit")
@CacheLookup
WebElement txt1sub;

@FindBy(how=How.NAME, using="addr")
@CacheLookup
WebElement txtaddr;	

@FindBy(how=How.NAME, using="sub")
@CacheLookup
WebElement txt1sub1;

public void clickEditCustomer() {
	EditCustomer.click();
}

public void seteditcustomer(String cusid) {
	txtCustomerID.sendKeys(String.valueOf(cusid));
}

public void clickEditFormSubmit() {
		 txt1sub.click();
}

public void Editaddress(String addr) {
	txtaddr.sendKeys(addr);
}

public void cust1submit() {
	txt1sub.click();
}
}




