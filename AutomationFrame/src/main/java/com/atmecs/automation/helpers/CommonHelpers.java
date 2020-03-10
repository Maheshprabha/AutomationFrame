package com.atmecs.automation.helpers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonHelpers {
	public static void SendkeysAction(WebDriver driver, String elementPath, String value) {
		driver.findElement(By.xpath(elementPath)).sendKeys(value);
	}

	public static void dropDown(WebDriver driver, String elementPath, String value, String option) {
		try {
			WebElement webElement = driver.findElement(By.xpath(elementPath));
			Select sc = new Select(webElement);
			if (option.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (option.equalsIgnoreCase("visibletext")) {
				sc.selectByVisibleText(value);
			} else if (option.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void moveOver(WebDriver driver,String elementPath)
	{
        WebElement mouseOver = driver.findElement(By.xpath(elementPath));
		Actions action=new Actions(driver);
		action.moveToElement(mouseOver).perform();
	}

	public static void clickAction(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
	}

	public void findFrame(WebDriver driver, String name) {
		try {
			List<WebElement> elements = driver.findElements(By.tagName("iframe"));
			int numberOfTags = elements.size();
			System.out.println("No. of Iframes on this Web Page are: " + numberOfTags);
			driver.switchTo().frame(name);
			System.out.println("Switching to the frame");
			Actions actions = new Actions(driver);
			WebElement findElement = driver.findElement(By.xpath(name));
			actions.moveToElement(findElement).perform();
			findElement.click();

			driver.switchTo().parentFrame();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
