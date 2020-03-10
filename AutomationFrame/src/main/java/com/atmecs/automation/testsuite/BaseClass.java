package com.atmecs.automation.testsuite;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import com.atmecs.automation.filepath.FilePath;
import com.atmecs.automation.utils.ReadProperites;

public class BaseClass {
	Properties property;
	 public WebDriver driver;
	@BeforeTest
	public void invokeBrowser() throws Exception {
		property = ReadProperites.readLocation(FilePath.Config_Path);
		System.out.println(property.getProperty("Url"));
		System.setProperty("webdriver.chrome.driver", FilePath.Chrome_Path );
		driver = new ChromeDriver();
		String baseUrl = property.getProperty("Url");
		System.out.println(baseUrl);
		driver.get(baseUrl);
}
}
