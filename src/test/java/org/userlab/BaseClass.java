package org.userlab;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
		
		public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();

	}
		
		public static void launchUrl(String url) {
			driver.get(url);
		}
		
		public static void browserMaxi() {
			driver.manage().window().maximize();
		}
		public static void fillValue(WebElement e, String value ) {
			e.sendKeys(value);
		}
		public static void clickBtn(WebElement e) {
			e.click();	

		}
		public static void doubclickBtn(WebElement e) {
		Actions a= new Actions(driver);
		a.doubleClick(e).perform();
		}
		public static void rightclickBtn(WebElement e) {
			Actions a= new Actions(driver);
			a.contextClick(e).perform();
		}
		public static void downBtn() throws AWTException {
			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_DOWN); 
			r.keyPress(KeyEvent.VK_DOWN);			
		}
		public static void enterBtn() throws AWTException {
			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_ENTER); 
			r.keyPress(KeyEvent.VK_ENTER);
		}
		public static void tabBtn() throws AWTException {
			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_TAB); 
			r.keyPress(KeyEvent.VK_TAB);
		}
		public static void pasteBtn() throws AWTException {
			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_CONTROL); 
			r.keyPress(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_CONTROL); 
			r.keyPress(KeyEvent.VK_V);
		}
		
		
		
		
}
