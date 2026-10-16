package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojowonderla2 extends BaseClass{
	public Pojowonderla2() {
		PageFactory.initElements(getDriver(),this);
	}
	@FindBy(xpath="(//div[@class='relative flex size-4 cursor-pointer items-center justify-center'])[2]")
	WebElement regularticket;
			@FindBy(xpath="(//button[text()='ADD'])[1]")
			WebElement Adultticket;
			
			@FindBy(xpath="//span[text()='Child']//parent::h3//parent::div//parent::div//following-sibling::div//child::button")
			WebElement childticket;
		
			@FindBy(xpath="(//div[@class='flex items-center justify-between px-3 py-1'])[2]")
			WebElement offerticket;
			
			@FindBy(xpath="//span[text()='Birthday BOGO - Paid Ticket']//parent::h3//parent::div//parent::div//following-sibling::div//child::button")
			WebElement BirthdayOffer;
			@FindBy(xpath="(//button[text()='ADD'])[8]")
			WebElement CollegeIdOffer;
			@FindBy(xpath="(//button[text()='ADD'])[9]")
			WebElement CollegeIdbuffetOffer;
			@FindBy(xpath="//span[text()='Defence Offer']//parent::h3//parent::div//parent::div//following-sibling::div//child::button[@class='flex items-center justify-center max-w-[150px] text-xs font-black uppercase leading-tight text-blue bg-white h-[42px] w-full rounded-[8px] border border-blue px-[30px]']")
			WebElement defenceOffer;
			
			@FindBy(xpath="(//div[@class='flex items-center justify-between px-3 py-1'])[3]")
			WebElement fasttrackticket;
			
			
			@FindBy(xpath="//span[text()='Fastrack Adult']//parent::h3//parent::div//parent::div//following-sibling::div//child::button")
			WebElement fasttrackadult;
			
			@FindBy(xpath="//button[text()='Confirm & Proceed']")
			WebElement Conformandproceed;
			@FindBy(xpath="//div[@class='flex w-[100%] items-center justify-between px-[30px]']//child::p[text()='proceed']")
			WebElement proceed1;
			
			public WebElement getRegularticket() {
				return regularticket;
			}
			public WebElement getAdultticket() {
				return Adultticket;
			}
			public WebElement getChildticket() {
				return childticket;
			}
			public WebElement getOfferticket() {
				return offerticket;
			}
			public WebElement getBirthdayOffer() {
				return BirthdayOffer;
			}
			public WebElement getCollegeIdOffer() {
				return CollegeIdOffer;
			}
			public WebElement getCollegeIdbuffetOffer() {
				return CollegeIdbuffetOffer;
			}
			public WebElement getDefenceOffer() {
				return defenceOffer;
			}
			public WebElement getFasttrackticket() {
				return fasttrackticket;
			}
			public WebElement getFasttrackadult() {
				return fasttrackadult;
			}
			public WebElement getConformandproceed() {
				return Conformandproceed;
			}
			public WebElement getProceed1() {
				return proceed1;
			}
}
