package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WonderlaBookticket extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	browserLaunch();
	launchUrl("https://www.wonderla.com");
	implicitWait(100);
	maxWin();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("document.body.style.zoom='65%'");
	Pojowonderla1 p1=new Pojowonderla1();
	p1.getBookticket().click();
	WebElement location = p1.getLocation();
	moveToElement(location);
	location.click();
	p1.getStandard_Tickets().click();
	p1.getSelectDate().click();
	WebElement proceed = p1.getProceed();
	moveToElement(proceed);
	proceed.click();
	
	Pojowonderla2 p2=new Pojowonderla2();
	p2.getAdultticket().click();
	p2.getChildticket().click();
	WebElement offer = p2.getOfferticket();
	js.executeScript("arguments[0].scrollIntoView()",offer);
	offer.click();
	Thread.sleep(5000);
	p2.getBirthdayOffer().click();
	driver.findElement(By.xpath("(//button[@tabindex='0'])[26]")).click();
	WebElement defence = p2.getDefenceOffer();
	js.executeScript("arguments[0].scrollIntoView()",defence);
	defence.click();
	Thread.sleep(5000);
	WebElement fasttrack= p2.getFasttrackticket();
	js.executeScript("arguments[0].scrollIntoView()",fasttrack);
	fasttrack.click();
	p2.getFasttrackadult().click();
	WebElement conformandproceed = p2.getConformandproceed();
	moveToElement(conformandproceed);
	conformandproceed.click();
	Thread.sleep(5000);
	p2.getProceed1().click();
	
	Pojowonderla3 p3=new Pojowonderla3();
	p3.getFirstName().sendKeys("MuraliM");
	p3.getEmail().sendKeys("mahekarthick47@gmail.com");
	p3.getPhoneno().sendKeys("9344228438");
	p3.getPincode().sendKeys("600019");
	Thread.sleep(5000);
	p3.getBooknow().click();
	
}
}
