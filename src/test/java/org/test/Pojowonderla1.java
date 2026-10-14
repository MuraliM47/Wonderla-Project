package org.test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojowonderla1 extends BaseClass {

		public Pojowonderla1() {
			PageFactory.initElements(getDriver(),this);
		}

		@FindBy(xpath="//h6[text()='Book ticket ']")
		WebElement Bookticket;
		@CacheLookup
		@FindBy(xpath="//p[text()='Chennai']//parent::div[@class='flex flex-col items-center']")
		WebElement location;
		
		@FindBy(xpath="//span[text()='Standard Tickets']//parent::h2[@class='flex items-center gap-1 text-[20px] font-[800]']")
		WebElement Standard_Tickets;
	
		@FindBy(xpath="//span[text()='16']//parent::div[@class='flex h-full w-full flex-col items-center justify-center rounded-[8px] text-[12px] text-black-300 transition-colors lg:rounded-[12px] lg:text-[16px]']")
		WebElement selectDate;
		
		@FindBy(xpath="//button[text()='Proceed']//parent::div[@class='fixed bottom-0 left-0 w-full max-w-[100%] bg-white p-2.5 lg:relative lg:bottom-0 lg:flex lg:max-w-[min(100vw-32px,577px)] lg:items-center lg:p-0 lg:pt-3']")
		WebElement proceed;
	
			
				public WebElement getBookticket() {
					return Bookticket;
				}
				public WebElement getLocation() {
					return location;
				}
				public WebElement getStandard_Tickets() {
					return Standard_Tickets;
				}
				public WebElement getSelectDate() {
					return selectDate;
				}
				public WebElement getProceed() {
					return proceed;
				}
				
//				@FindBy(xpath="//h2[text()='Login']")
//				private WebElement login;
//				@FindBy(xpath="//input[@type='text']")
//				private WebElement mobile;
//				@FindBy(xpath="//(button[@tabindex='0'])[2]")
//				private WebElement otp;
//				@FindBy(xpath="//input[@name='fullName']")
//				private WebElement fullname;
//				@FindBy(xpath="//input[@name='email']")
//				private WebElement mailid;
//				@FindBy(xpath="//div[text()='Male']")
//				private WebElement gender;
//				@FindBy(id="calendar-07")
//				private WebElement calender;
//				
//				private WebElement dob;
//				@FindBy(xpath="//input[@name='pinCode']")
//				private WebElement pincode;
//				@FindBy(xpath="//input[@name='address']")
//				private WebElement address;
//				@FindBy(xpath="//input[@name='region']")
//				private WebElement region;
//				@FindBy(xpath="//button[text()='Confirm & Update']")
//			 private WebElement conformandupdate;
				
//		public WebElement getLogin() {
//			return login;
//		}
//		public WebElement getMobile() {
//			return mobile;
//		}
//		public WebElement getOtp() {
//			return otp;
//		}
//		public WebElement getFullname() {
//			return fullname;
//		}
//		public WebElement getMailid() {
//			return mailid;
//		}
//		public WebElement getGender() {
//			return gender;
//		}
//		public WebElement getCalender() {
//			return calender;
//		}
//		public WebElement getDob() {
//			return dob;
//		}
//		public WebElement getPincode() {
//			return pincode;
//		}
//		public WebElement getAddress() {
//			return address;
//		}
//		public WebElement getRegion() {
//			return region;
//		}
//		public WebElement getConformandupdate() {
//			return conformandupdate;
//		}
//		
//		
}
