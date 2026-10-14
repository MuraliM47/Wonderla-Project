package org.step;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.test.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{
	@Before(order=3)
	public void bef()  {
		    browserLaunch();
		    implicitWait(1000);
			
	}
	@Before(order=5)
	public void bef1() throws InterruptedException  {
	    
		launchUrl("https://www.wonderla.com");
		Thread.sleep(500);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='65%'");
				
}
	@After()
	public void aft(Scenario s) throws InterruptedException,IOException {
		if(s.isFailed()) {
			TakesScreenshot tk=(TakesScreenshot)getDriver();
			byte[] sc = tk.getScreenshotAs(OutputType.BYTES);
			s.attach(sc, "image/png", s.getName());
			System.out.println("Screenshot attached");
			
		}
		
		Thread.sleep(5000);
//		closeBrowser();
	}
}
