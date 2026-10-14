package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Dynamic {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@role='button']")).click();
	Thread.sleep(5000);
	WebElement Electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
	Actions a= new Actions(driver);
	a.moveToElement(Electronics).click().perform();
	Thread.sleep(5000);
	WebElement bike = driver.findElement(By.xpath("//div[text()='Two wheelers ']"));
	bike.click();
	Thread.sleep(5000);
WebElement price = driver.findElement(By.xpath("//div[text()='Chetak C3503 Electric Scooter by Bajaj Auto Booking for Ex-Showroom Price (with Portable Charger, Matt...']//ancestor::div[@class='col col-7-12']//following-sibling::div[@class='col col-5-12 mao5dl']//child::div[text()='₹1,24,157']"));
a.moveToElement(price).perform();
String amount = price.getText();
System.out.println("Bajaj chetak onroad price:"+amount);
}
}
