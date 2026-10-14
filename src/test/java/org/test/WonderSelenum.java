package org.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WonderSelenum extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000000));
		driver.get("https://www.wonderla.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.body.style.zoom='65%'");
		
		driver.findElement(By.xpath("//h6[text()='Book ticket ']")).click();
	Thread.sleep(50);
		WebElement location = driver.findElement(By.xpath("//p[text()='Chennai']//parent::div[@class='flex flex-col items-center']"));
		Actions a=new Actions(driver);
		a.moveToElement(location).click().perform();

		Thread.sleep(50);
		driver.findElement(By.xpath("//span[text()='Standard Tickets']//parent::h2[@class='flex items-center gap-1 text-[20px] font-[800]']")).click();

		driver.findElement(By.xpath("//span[text()='16']//parent::div[@class='flex h-full w-full flex-col items-center justify-center rounded-[8px] text-[12px] text-black-300 transition-colors lg:rounded-[12px] lg:text-[16px]']")).click();

		
		WebElement proceed=driver.findElement(By.xpath("//button[text()='Proceed']//parent::div[@class='fixed bottom-0 left-0 w-full max-w-[100%] bg-white p-2.5 lg:relative lg:bottom-0 lg:flex lg:max-w-[min(100vw-32px,577px)] lg:items-center lg:p-0 lg:pt-3']"));
		a.moveToElement(proceed).click().perform();

		
		//driver.findElement(By.xpath("//h4[text()='Regular Ticket']")).click();
		
		
		Thread.sleep(50);
		driver.findElement(By.xpath("(//button[text()='ADD'])[1]")).click();

		
		
		driver.findElement(By.xpath("//span[text()='Child']//parent::h3//parent::div//parent::div//following-sibling::div//child::button")).click();


//		WebElement offer = driver.findElement(By.xpath("//h4[text()='Offer Tickets']"));
		WebElement offer = driver.findElement(By.xpath("(//div[@class='flex items-center justify-between px-3 py-1'])[2]"));
		js.executeScript("arguments[0].scrollIntoView()",offer);
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(offer)).click();
		offer.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Thread.sleep(5000);
       driver.findElement(By.xpath("//span[text()='Birthday Offer - Paid']//parent::h3//parent::div//parent::div//following-sibling::div//child::button")).click();
       
	driver.findElement(By.xpath("(//button[@tabindex='0'])[26]")).click();
	
	Thread.sleep(5000);
		WebElement defence = driver.findElement(By.xpath("//span[text()='Defence Offer']//parent::h3//parent::div//parent::div//following-sibling::div//child::button[@class='flex items-center justify-center max-w-[150px] text-xs font-black uppercase leading-tight text-blue bg-white h-[42px] w-full rounded-[8px] border border-blue px-[30px]']"));
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.elementToBeClickable(defence)).click();
		js.executeScript("arguments[0].scrollIntoView()",defence);
		defence.click();
//		driver.findElement(By.xpath("(//button[@tabindex='0'])[29]")).click();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		Thread.sleep(5000);
		WebElement fasttrack = driver.findElement(By.xpath("(//div[@class='flex items-center justify-between px-3 py-1'])[3]"));
		js.executeScript("arguments[0].scrollIntoView()",fasttrack);
//		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
//		w.until(ExpectedConditions.elementToBeClickable(fasttrack)).click();
	
		fasttrack.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Fastrack Adult']//parent::h3//parent::div//parent::div//following-sibling::div//child::button")).click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//button[text()='Confirm & Proceed']"));
		a.moveToElement(element).click().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='flex w-[100%] items-center justify-between px-[30px]']//child::p[text()='proceed']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("MuraliM");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mahekarthick47@gmail.com");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9344228438");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("600019");
		Thread.sleep(50000);
//       WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
//      a.moveToElement(checkbox).click().perform();
       
		driver.findElement(By.xpath("//button[text()='Book Now']")).click();
		
	}
	
}
