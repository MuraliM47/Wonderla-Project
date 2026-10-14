package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.interactions.Actions;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BaseClass {
	public static WebDriver driver;
	protected static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return tlDriver.get();
	}

	public static void setDriver(WebDriver driver) {
		tlDriver.set(driver);
	}

	public static void browserLaunch() {

		driver = new ChromeDriver();
		setDriver(driver);
	}

	public static void firefox() {

		driver = new FirefoxDriver();
		setDriver(driver);
	}

	public static void edge() {
		driver = new EdgeDriver();
		setDriver(driver);
	}


	
//	protected static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
//
//	public static WebDriver getDriver() {
//	    return tlDriver.get();
//	}
//
//	public static void setDriver(WebDriver driver) {
//	    tlDriver.set(driver);
//	}
//
//	public static void browserLaunch(String browser) {
//
//	    WebDriver driver;
//
//	    switch (browser.toLowerCase()) {
//
//	        case "chrome":
//	            driver = new ChromeDriver();
//	            break;
//
//	        case "firefox":
//	            driver = new FirefoxDriver();
//	            break;
//
//	        case "edge":
//	            driver = new EdgeDriver();
//	            break;
//
//	        default:
//	            throw new IllegalArgumentException(
//	                "Invalid browser: " + browser
//	            );
//	    }
//
//	    setDriver(driver);
//	}
	
	
	
	
	
	
	
	public static void launchUrl(String url) {
		getDriver().get(url);
	}

	public static void titleUrl() {
		String title = getDriver().getTitle();
		System.out.println(title);
	}

	public static void getCurrentUrl() {
		String url = getDriver().getCurrentUrl();
		System.out.println(url);

	}

	public static void maxWin() {
		getDriver().manage().window().maximize();
	}

	public static void closeBrowser() {
		getDriver().close();
	}

	public static void quitBrowser() {
		getDriver().quit();
	}

	public static void sendKey(WebElement ref, String Value) {

		ref.sendKeys(Value);
	}

	public static void click(WebElement cli) {

		cli.click();
	}

	public static void getText(WebElement txt) {
		String i = txt.getText();
		System.out.println(i);

	}

	public static String getAttribute(WebElement element, String attribute) {
		String a = element.getAttribute(attribute);
		System.out.println(a);
		return a;
	}

	public static void moveToElement(WebElement element) {
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element).perform();
	}

	public static void dragAndDrop(WebElement element, WebElement ref) {
		Actions actions = new Actions(getDriver());

		actions.dragAndDrop(element, ref).perform();
	}

	public static void doubleClick(WebElement element) {
		Actions actions = new Actions(getDriver());
		actions.doubleClick(element).perform();
	}

	public static void keyDown(WebElement element) {
		Actions actions = new Actions(getDriver());
		actions.keyDown(element, Keys.SHIFT).perform();
	}

	public static void keyUp(WebElement element) {
		Actions actions = new Actions(getDriver());
		actions.keyUp(element, Keys.SHIFT).perform();
	}

	public static void contextClick(WebElement element) {
		Actions actions = new Actions(getDriver());
		actions.contextClick(element).perform();
	}

	public static void pressEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void pressTab() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	public static void pressDown() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void pressUp() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
	}

	public static void copy() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);

		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void paste() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void acceptAlert() {
		Alert a = getDriver().switchTo().alert();
		String al = a.getText();
		System.out.println(al);
		a.accept();
	}

	public static void dismissAlert() {
		getDriver().switchTo().alert().dismiss();

	}

	public static void getAlertText() {
		getDriver().switchTo().alert().getText();
	}

	public static void takeScreenshot(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(
				"C:\\Users\\mahek\\eclipse-workspace\\MavenExample\\src\\test\\java\\screenshot" + name + ".png");

		FileUtils.copyFile(source, destination);
	}

	public static void switchWindow() {
		String window = getDriver().getWindowHandle();
		System.out.println(window);
		Set<String> windows = getDriver().getWindowHandles();
		System.out.println(windows);

		List<String> l = new ArrayList<String>();
		l.addAll(windows);
		String child = l.get(1);
		getDriver().switchTo().window(child);
	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	public static void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void implicitWait(int seconds) {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public static void waitForClickable(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void javaScript(WebElement r) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].setAttribute('value','SmartSkills')", r);
	}

	public static void javaScript1(WebElement j) {
		JavascriptExecutor je = (JavascriptExecutor) getDriver();
		Object t = je.executeScript("return arguments[0].getAttribute('value')", j);
		System.out.println(t);

	}

	public static String getData(String SheetName, int rowNo, int cellNo) throws IOException {

		File f = new File("C:\\Users\\mahek\\eclipse-workspace\\.metadata\\Murali\\Excel\\Engineering clg list.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet(SheetName);

		Row r = sh.getRow(rowNo);

		Cell all = r.getCell(cellNo);

		int type = all.getCellType();
		String name;

		if (type == 1) {
			name = all.getStringCellValue();
			System.out.println(name);
		} else if (DateUtil.isCellDateFormatted(all)) {
			Date day = all.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MMM/yyyy");
			name = sim.format(day);
			System.out.println(name);
		} else {
			double da = all.getNumericCellValue();
			long l = (long) da;
			name = String.valueOf(l);
			System.out.println(name);
		}

		return name;

	}
}
