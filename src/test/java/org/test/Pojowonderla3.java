package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojowonderla3 extends BaseClass{
	public Pojowonderla3() {
		PageFactory.initElements(getDriver(),this);
	}
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement firstName;
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement phoneno;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement pincode;
	@FindBy(xpath="//button[text()='Book Now']")
	WebElement booknow;

	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPhoneno() {
		return phoneno;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getBooknow() {
		return booknow;
	}
			
}
