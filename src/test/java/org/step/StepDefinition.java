
package org.step;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.test.BaseClass;
import org.test.Pojowonderla1;
import org.test.Pojowonderla2;
import org.test.Pojowonderla3;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("User have to check the ticket booking functionality through chrome browser")
	public void user_have_to_check_the_ticket_booking_functionality_through_chrome_browser() throws InterruptedException {
//		browserLaunch();
//		launchUrl("https://www.wonderla.com");
		
		maxWin();
		Thread.sleep(500);
	}
	@When("User have to check the standard ticket booking functionality of wonderla application")
	public void user_have_to_check_the_standard_ticket_booking_functionality_of_wonderla_application() throws InterruptedException {
		Pojowonderla1 p1=new Pojowonderla1();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		p1.getBookticket().click();
		WebElement location = p1.getLocation();
		moveToElement(location);
		location.click();
		p1.getStandard_Tickets().click();
		p1.getSelectDate().click();
		WebElement proceed = p1.getProceed();
		moveToElement(proceed);
		Assert.assertTrue(proceed.isDisplayed(),"proceed button not displayed");
		proceed.click();
		Thread.sleep(5000);
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
		Assert.assertTrue(conformandproceed.isDisplayed(),"conformandproceed button not displayed");
		conformandproceed.click();
		Thread.sleep(5000);
		p2.getProceed1().click();
		
	}
	@When("User have to fill the User required details to book ticket")
	public void user_have_to_fill_the_user_required_details_to_book_ticket() throws InterruptedException {
		Pojowonderla3 p3=new Pojowonderla3();
		p3.getFirstName().sendKeys("MuraliM");
		String actual=p3.getFirstName().getAttribute("value");
		assertEquals(actual,"MuraliM");
		p3.getEmail().sendKeys("mahekarthick47@gmail.com");
		p3.getPhoneno().sendKeys("9344228438");
		p3.getPincode().sendKeys("600019");
		Thread.sleep(5000);
		WebElement booknow=p3.getBooknow();
		booknow.click();
	}
	@When("User have to fill the Invalid User {string} and {string} details to book ticket")
	public void userHaveToFillTheInvalidUserAndDetailsToBookTicket(String name, String phoneno) throws InterruptedException {
		Pojowonderla3 p3=new Pojowonderla3();
		sendKey(p3.getFirstName(),name);
		String actual=p3.getFirstName().getAttribute("value");
		assertEquals(actual,"MuraliM");
		p3.getEmail().sendKeys("mahekarthick47@gmail.com");
		sendKey(p3.getPhoneno(),phoneno);
		p3.getPincode().sendKeys("600019");
		Thread.sleep(5000);
		WebElement booknow=p3.getBooknow();
		booknow.click();
	}

	@Then("User have to close the browser")
	public void user_have_to_close_the_browser() {
	   closeBrowser();
	}

}
