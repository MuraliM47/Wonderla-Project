package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Maketrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|Brand-BrandVariants_DT|B_M_Makemytrip_Variants|Brand-Terms_Exact&gad_source=1&gad_campaignid=313149128&gbraid=0AAAAAD5Az1ROCm87aZZz3oMJz99V0GTOk&gclid=Cj0KCQjw5bjVBhCiARIsAJzMVnRyISU0AO5Fqb-xo0x2EBt-KNdWnR4EugJL0cBJib1vN-YMkj40SloaAj6FEALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
		Actions a= new Actions(driver);
		a.moveToElement(search).click().perform();
	
		Thread.sleep(5000);
		driver.navigate().refresh();
		WebElement Airticket = driver.findElement(By.xpath("//div[text()='Akasa Air']//ancestor::div[@class='flightCard__contentRow']//following-sibling::div[@class='priceSection priceLockPersuasionExists priceInfoWithCoupon flightCard__priceBlock']//ancestor::div[@class='fareBlock__fareRow makeFlex hrtlCenter']"));

	String price = Airticket.getText();
	
	System.out.println("Akash Air ticket price:"+price);
	}
	}

