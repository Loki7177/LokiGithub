package org.company;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.userlab.BaseClass;

public class DemoClass extends BaseClass{

	public static void main(String[] args) throws AWTException {
		
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		browserMaxi();
		WebElement username = driver.findElement(By.id("email"));
		fillValue(username, "Greens");
//		WebElement password = driver.findElement(By.id("pass"));
		doubclickBtn(username);
		rightclickBtn(username);
		
		for (int i = 0; i < 3; i++) {
		downBtn();
		}
	enterBtn();
	tabBtn();
	pasteBtn();
		
				
	}
}
